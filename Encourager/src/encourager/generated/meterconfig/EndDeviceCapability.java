//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.24 at 05:14:09 PM BST 
//


package encourager.generated.meterconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndDeviceCapability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndDeviceCapability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autonomousDst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="communication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="connectDisconnect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="demandResponse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="electricMetering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gasMetering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="metrology" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="onRequestRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outageHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pressureCompensation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pricingInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pulseOutput" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="relaysProgramming" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reverseFlow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="superCompressibilityCompensation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="temperatureCompensation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="textMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="waterMetering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndDeviceCapability", propOrder = {
    "autonomousDst",
    "communication",
    "connectDisconnect",
    "demandResponse",
    "electricMetering",
    "gasMetering",
    "metrology",
    "onRequestRead",
    "outageHistory",
    "pressureCompensation",
    "pricingInfo",
    "pulseOutput",
    "relaysProgramming",
    "reverseFlow",
    "superCompressibilityCompensation",
    "temperatureCompensation",
    "textMessage",
    "waterMetering"
})
public class EndDeviceCapability {

    protected Boolean autonomousDst;
    protected Boolean communication;
    protected Boolean connectDisconnect;
    protected Boolean demandResponse;
    protected Boolean electricMetering;
    protected Boolean gasMetering;
    protected Boolean metrology;
    protected Boolean onRequestRead;
    protected Boolean outageHistory;
    protected Boolean pressureCompensation;
    protected Boolean pricingInfo;
    protected Boolean pulseOutput;
    protected Boolean relaysProgramming;
    protected Boolean reverseFlow;
    protected Boolean superCompressibilityCompensation;
    protected Boolean temperatureCompensation;
    protected Boolean textMessage;
    protected Boolean waterMetering;

    /**
     * Gets the value of the autonomousDst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutonomousDst() {
        return autonomousDst;
    }

    /**
     * Sets the value of the autonomousDst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutonomousDst(Boolean value) {
        this.autonomousDst = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommunication(Boolean value) {
        this.communication = value;
    }

    /**
     * Gets the value of the connectDisconnect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectDisconnect() {
        return connectDisconnect;
    }

    /**
     * Sets the value of the connectDisconnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectDisconnect(Boolean value) {
        this.connectDisconnect = value;
    }

    /**
     * Gets the value of the demandResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDemandResponse() {
        return demandResponse;
    }

    /**
     * Sets the value of the demandResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDemandResponse(Boolean value) {
        this.demandResponse = value;
    }

    /**
     * Gets the value of the electricMetering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectricMetering() {
        return electricMetering;
    }

    /**
     * Sets the value of the electricMetering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectricMetering(Boolean value) {
        this.electricMetering = value;
    }

    /**
     * Gets the value of the gasMetering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGasMetering() {
        return gasMetering;
    }

    /**
     * Sets the value of the gasMetering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGasMetering(Boolean value) {
        this.gasMetering = value;
    }

    /**
     * Gets the value of the metrology property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMetrology() {
        return metrology;
    }

    /**
     * Sets the value of the metrology property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMetrology(Boolean value) {
        this.metrology = value;
    }

    /**
     * Gets the value of the onRequestRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnRequestRead() {
        return onRequestRead;
    }

    /**
     * Sets the value of the onRequestRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnRequestRead(Boolean value) {
        this.onRequestRead = value;
    }

    /**
     * Gets the value of the outageHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutageHistory() {
        return outageHistory;
    }

    /**
     * Sets the value of the outageHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutageHistory(Boolean value) {
        this.outageHistory = value;
    }

    /**
     * Gets the value of the pressureCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPressureCompensation() {
        return pressureCompensation;
    }

    /**
     * Sets the value of the pressureCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPressureCompensation(Boolean value) {
        this.pressureCompensation = value;
    }

    /**
     * Gets the value of the pricingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricingInfo() {
        return pricingInfo;
    }

    /**
     * Sets the value of the pricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricingInfo(Boolean value) {
        this.pricingInfo = value;
    }

    /**
     * Gets the value of the pulseOutput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPulseOutput() {
        return pulseOutput;
    }

    /**
     * Sets the value of the pulseOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPulseOutput(Boolean value) {
        this.pulseOutput = value;
    }

    /**
     * Gets the value of the relaysProgramming property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelaysProgramming() {
        return relaysProgramming;
    }

    /**
     * Sets the value of the relaysProgramming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelaysProgramming(Boolean value) {
        this.relaysProgramming = value;
    }

    /**
     * Gets the value of the reverseFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseFlow() {
        return reverseFlow;
    }

    /**
     * Sets the value of the reverseFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseFlow(Boolean value) {
        this.reverseFlow = value;
    }

    /**
     * Gets the value of the superCompressibilityCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuperCompressibilityCompensation() {
        return superCompressibilityCompensation;
    }

    /**
     * Sets the value of the superCompressibilityCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuperCompressibilityCompensation(Boolean value) {
        this.superCompressibilityCompensation = value;
    }

    /**
     * Gets the value of the temperatureCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemperatureCompensation() {
        return temperatureCompensation;
    }

    /**
     * Sets the value of the temperatureCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemperatureCompensation(Boolean value) {
        this.temperatureCompensation = value;
    }

    /**
     * Gets the value of the textMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextMessage() {
        return textMessage;
    }

    /**
     * Sets the value of the textMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextMessage(Boolean value) {
        this.textMessage = value;
    }

    /**
     * Gets the value of the waterMetering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaterMetering() {
        return waterMetering;
    }

    /**
     * Sets the value of the waterMetering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaterMetering(Boolean value) {
        this.waterMetering = value;
    }

}