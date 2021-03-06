//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.24 at 05:14:09 PM BST 
//


package encourager.generated.meterconfig;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndDeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndDeviceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isSolidState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="phaseCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ratedCurrent" type="{http://www.encourage-project.eu/MeterConfig#}CurrentFlow" minOccurs="0"/>
 *         &lt;element name="ratedVoltage" type="{http://www.encourage-project.eu/MeterConfig#}Voltage" minOccurs="0"/>
 *         &lt;element name="AssetModel" type="{http://www.encourage-project.eu/MeterConfig#}ProductAssetModel" minOccurs="0"/>
 *         &lt;element name="capability" type="{http://www.encourage-project.eu/MeterConfig#}EndDeviceCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndDeviceInfo", propOrder = {
    "isSolidState",
    "phaseCount",
    "ratedCurrent",
    "ratedVoltage",
    "assetModel",
    "capability"
})
public class EndDeviceInfo {

    protected Boolean isSolidState;
    protected BigInteger phaseCount;
    protected Float ratedCurrent;
    protected Float ratedVoltage;
    @XmlElement(name = "AssetModel")
    protected ProductAssetModel assetModel;
    protected EndDeviceCapability capability;

    /**
     * Gets the value of the isSolidState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSolidState() {
        return isSolidState;
    }

    /**
     * Sets the value of the isSolidState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSolidState(Boolean value) {
        this.isSolidState = value;
    }

    /**
     * Gets the value of the phaseCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhaseCount() {
        return phaseCount;
    }

    /**
     * Sets the value of the phaseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhaseCount(BigInteger value) {
        this.phaseCount = value;
    }

    /**
     * Gets the value of the ratedCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * Sets the value of the ratedCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRatedCurrent(Float value) {
        this.ratedCurrent = value;
    }

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRatedVoltage(Float value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the assetModel property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAssetModel }
     *     
     */
    public ProductAssetModel getAssetModel() {
        return assetModel;
    }

    /**
     * Sets the value of the assetModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAssetModel }
     *     
     */
    public void setAssetModel(ProductAssetModel value) {
        this.assetModel = value;
    }

    /**
     * Gets the value of the capability property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceCapability }
     *     
     */
    public EndDeviceCapability getCapability() {
        return capability;
    }

    /**
     * Sets the value of the capability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceCapability }
     *     
     */
    public void setCapability(EndDeviceCapability value) {
        this.capability = value;
    }

}
