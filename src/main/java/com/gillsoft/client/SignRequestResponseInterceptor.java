package com.gillsoft.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StreamUtils;

import com.gillsoft.logging.RequestResponseLoggingInterceptor;
import com.gillsoft.util.StringUtil;

public class SignRequestResponseInterceptor extends RequestResponseLoggingInterceptor {
	
	private static Signature signature;
	private static Signature verificator;
	
	static {
		try {
			signature = Signature.getInstance("SHA1withRSA");

			// загружаем ключь
			FileInputStream inputStream = new FileInputStream(ResourceUtils.getFile("classpath:private_key.der"));
			ByteArrayOutputStream keyBaos = new ByteArrayOutputStream();
			StreamUtils.copy(inputStream, keyBaos);

			// получаем приватный ключь
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PKCS8EncodedKeySpec privSpec = new PKCS8EncodedKeySpec(keyBaos.toByteArray());
			PrivateKey privKey = (RSAPrivateKey) keyFactory.generatePrivate(privSpec);

			// создаем сигнатуру шифрования
			signature.initSign(privKey);
		} catch (Exception e) {
		}
		try {
			verificator = Signature.getInstance("SHA1withRSA");

			// загружаем сетификат
			FileInputStream inputStream = new FileInputStream(ResourceUtils.getFile("classpath:public_key.der"));
			ByteArrayOutputStream certBaos = new ByteArrayOutputStream();
			StreamUtils.copy(inputStream, certBaos);

			// получаем публичный ключь из сертификата
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			X509Certificate cert = (X509Certificate) cf
					.generateCertificate(new ByteArrayInputStream(certBaos.toByteArray()));
			PublicKey pubKey = cert.getPublicKey();

			// создаем сигнатуру верификации
			verificator.initVerify(pubKey);
		} catch (Exception e) {
		}
	}
	
	private synchronized byte[] signRequest(byte[] body) throws SignatureException {
		signature.update(body);
		return new String(body).replace("<xmlsign>_</xmlsign>",
				StringUtil.toBase64(signature.sign())).getBytes();
	}
	
	@Override
	public ClientHttpResponse execute(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		try {
			return execution.execute(request, signRequest(body));
		} catch (SignatureException e) {
			throw new IOException("Can not sign request", e);
		}
	}

}
