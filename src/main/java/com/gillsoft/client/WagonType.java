//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.08 at 08:17:36 PM EET 
//


package com.gillsoft.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for wagon_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wagon_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="place_count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{}code_type"/>
 *         &lt;element name="subtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{}code_type"/>
 *         &lt;element name="railway" type="{}code_type"/>
 *         &lt;element name="sitting" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="class" type="{}code_type"/>
 *         &lt;element name="service">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{}code_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cost" type="{}cost_type" minOccurs="0"/>
 *         &lt;element name="costreserve" type="{}cost_type" minOccurs="0"/>
 *         &lt;element name="places" type="{}places_type"/>
 *         &lt;element name="allow_bonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lower" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="top" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="side_lower" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="side_top" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wagon_type", propOrder = {
    "charline",
    "placeCount",
    "number",
    "type",
    "subtype",
    "country",
    "railway",
    "sitting",
    "clazz",
    "service",
    "cost",
    "costreserve",
    "places",
    "allowBonus"
})
public class WagonType {

	@XmlValue
    protected String value;
    @XmlElement(required = true)
    protected String charline;
    @XmlElement(name = "place_count", required = true)
    protected String placeCount;
    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true)
    protected CodeType type;
    @XmlElement(required = true)
    protected String subtype;
    @XmlElement(required = true)
    protected CodeType country;
    @XmlElement(required = true)
    protected CodeType railway;
    @XmlElement(required = true)
    protected String sitting;
    @XmlElement(name = "class", required = true)
    protected CodeType clazz;
    @XmlElement(required = true)
    protected WagonType.Service service;
    protected CostType cost;
    protected CostType costreserve;
    @XmlElement(required = true)
    protected PlacesType places;
    @XmlElement(name = "allow_bonus")
    protected String allowBonus;
    @XmlAttribute(name = "type")
    protected String typeAttr;
    @XmlAttribute(name = "lower")
    protected String lower;
    @XmlAttribute(name = "top")
    protected String top;
    @XmlAttribute(name = "side_lower")
    protected String sideLower;
    @XmlAttribute(name = "side_top")
    protected String sideTop;
    @XmlAttribute(name = "class")
    protected String classAttr;

    public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
     * Gets the value of the charline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharline() {
        return charline;
    }

    /**
     * Sets the value of the charline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharline(String value) {
        this.charline = value;
    }

    /**
     * Gets the value of the placeCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceCount() {
        return placeCount;
    }

    /**
     * Sets the value of the placeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceCount(String value) {
        this.placeCount = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setType(CodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype(String value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCountry(CodeType value) {
        this.country = value;
    }

    /**
     * Gets the value of the railway property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRailway() {
        return railway;
    }

    /**
     * Sets the value of the railway property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRailway(CodeType value) {
        this.railway = value;
    }

    /**
     * Gets the value of the sitting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitting() {
        return sitting;
    }

    /**
     * Sets the value of the sitting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitting(String value) {
        this.sitting = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setClazz(CodeType value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link WagonType.Service }
     *     
     */
    public WagonType.Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link WagonType.Service }
     *     
     */
    public void setService(WagonType.Service value) {
        this.service = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link CostType }
     *     
     */
    public CostType getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostType }
     *     
     */
    public void setCost(CostType value) {
        this.cost = value;
    }

    /**
     * Gets the value of the costreserve property.
     * 
     * @return
     *     possible object is
     *     {@link CostType }
     *     
     */
    public CostType getCostreserve() {
        return costreserve;
    }

    /**
     * Sets the value of the costreserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostType }
     *     
     */
    public void setCostreserve(CostType value) {
        this.costreserve = value;
    }

    /**
     * Gets the value of the places property.
     * 
     * @return
     *     possible object is
     *     {@link PlacesType }
     *     
     */
    public PlacesType getPlaces() {
        return places;
    }

    /**
     * Sets the value of the places property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacesType }
     *     
     */
    public void setPlaces(PlacesType value) {
        this.places = value;
    }

    /**
     * Gets the value of the allowBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowBonus() {
        return allowBonus;
    }

    /**
     * Sets the value of the allowBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowBonus(String value) {
        this.allowBonus = value;
    }

    /**
     * Gets the value of the typeAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAttr() {
        return typeAttr;
    }

    /**
     * Sets the value of the typeAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAttr(String value) {
        this.typeAttr = value;
    }

    /**
     * Gets the value of the lower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLower() {
        return lower;
    }

    /**
     * Sets the value of the lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLower(String value) {
        this.lower = value;
    }

    /**
     * Gets the value of the top property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTop(String value) {
        this.top = value;
    }

    /**
     * Gets the value of the sideLower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideLower() {
        return sideLower;
    }

    /**
     * Sets the value of the sideLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideLower(String value) {
        this.sideLower = value;
    }

    /**
     * Gets the value of the sideTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideTop() {
        return sideTop;
    }

    /**
     * Sets the value of the sideTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideTop(String value) {
        this.sideTop = value;
    }

    /**
     * Gets the value of the classAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassAttr() {
        return classAttr;
    }

    /**
     * Sets the value of the classAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassAttr(String value) {
        this.classAttr = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{}code_type" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Service {

        protected List<CodeType> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeType }
         * 
         * 
         */
        public List<CodeType> getItem() {
            if (item == null) {
                item = new ArrayList<CodeType>();
            }
            return this.item;
        }

    }

}
