//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.08 at 08:17:36 PM EET 
//


package com.gillsoft.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for train_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="train_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="station_from" type="{}code_type"/>
 *         &lt;element name="station_to" type="{}code_type"/>
 *         &lt;element name="class" type="{}code_type"/>
 *         &lt;element name="fasted" type="{}code_type"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departure_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrival_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="travel_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="places" type="{}places_type"/>
 *         &lt;element name="wagons" type="{}places_type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fasted" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "train_type", propOrder = {
    "number",
    "model",
    "category",
    "stationFrom",
    "stationTo",
    "clazz",
    "fasted",
    "date",
    "departureDate",
    "arrivalDate",
    "travelTime",
    "places",
    "wagons"
})
public class TrainType {

	@XmlValue
    protected String value;
    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(name = "station_from", required = true)
    protected CodeType stationFrom;
    @XmlElement(name = "station_to", required = true)
    protected CodeType stationTo;
    @XmlElement(name = "class", required = true)
    protected CodeType clazz;
    @XmlElement(required = true)
    protected CodeType fasted;
    @XmlElement(required = true)
    protected String date;
    @XmlElement(name = "departure_date", required = true)
    protected String departureDate;
    @XmlElement(name = "arrival_date", required = true)
    protected String arrivalDate;
    @XmlElement(name = "travel_time", required = true)
    protected String travelTime;
    @XmlElement(required = true)
    protected PlacesType places;
    @XmlElement(required = true)
    protected PlacesType wagons;
    @XmlAttribute(name = "model")
    protected String modelAttr;
    @XmlAttribute(name = "class")
    protected String classAttr;
    @XmlAttribute(name = "fasted")
    protected String fastedAttr;

    public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the stationFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStationFrom() {
        return stationFrom;
    }

    /**
     * Sets the value of the stationFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStationFrom(CodeType value) {
        this.stationFrom = value;
    }

    /**
     * Gets the value of the stationTo property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStationTo() {
        return stationTo;
    }

    /**
     * Sets the value of the stationTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStationTo(CodeType value) {
        this.stationTo = value;
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
     * Gets the value of the fasted property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFasted() {
        return fasted;
    }

    /**
     * Sets the value of the fasted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFasted(CodeType value) {
        this.fasted = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelTime(String value) {
        this.travelTime = value;
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
     * Gets the value of the wagons property.
     * 
     * @return
     *     possible object is
     *     {@link PlacesType }
     *     
     */
    public PlacesType getWagons() {
        return wagons;
    }

    /**
     * Sets the value of the wagons property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacesType }
     *     
     */
    public void setWagons(PlacesType value) {
        this.wagons = value;
    }

    /**
     * Gets the value of the modelAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelAttr() {
        return modelAttr;
    }

    /**
     * Sets the value of the modelAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelAttr(String value) {
        this.modelAttr = value;
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
     * Gets the value of the fastedAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastedAttr() {
        return fastedAttr;
    }

    /**
     * Sets the value of the fastedAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastedAttr(String value) {
        this.fastedAttr = value;
    }

}
