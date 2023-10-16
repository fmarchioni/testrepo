
package gr.alpha.cbs.ml.fuse.referencedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranslateDataPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranslateDataPayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestItem" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}TranslateDataRequestItem"/&gt;
 *         &lt;element name="LoggingInfo" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}LoggingInfoType"/&gt;
 *         &lt;element name="EnvParams" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}EnvParamsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslateDataPayload", propOrder = {
    "requestItem",
    "loggingInfo",
    "envParams"
})
public class TranslateDataPayload {

    @XmlElement(name = "RequestItem", required = true)
    protected TranslateDataRequestItem requestItem;
    @XmlElement(name = "LoggingInfo", required = true)
    protected LoggingInfoType loggingInfo;
    @XmlElement(name = "EnvParams", required = true)
    protected EnvParamsType envParams;

    /**
     * Gets the value of the requestItem property.
     * 
     * @return
     *     possible object is
     *     {@link TranslateDataRequestItem }
     *     
     */
    public TranslateDataRequestItem getRequestItem() {
        return requestItem;
    }

    /**
     * Sets the value of the requestItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslateDataRequestItem }
     *     
     */
    public void setRequestItem(TranslateDataRequestItem value) {
        this.requestItem = value;
    }

    /**
     * Gets the value of the loggingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LoggingInfoType }
     *     
     */
    public LoggingInfoType getLoggingInfo() {
        return loggingInfo;
    }

    /**
     * Sets the value of the loggingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoggingInfoType }
     *     
     */
    public void setLoggingInfo(LoggingInfoType value) {
        this.loggingInfo = value;
    }

    /**
     * Gets the value of the envParams property.
     * 
     * @return
     *     possible object is
     *     {@link EnvParamsType }
     *     
     */
    public EnvParamsType getEnvParams() {
        return envParams;
    }

    /**
     * Sets the value of the envParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvParamsType }
     *     
     */
    public void setEnvParams(EnvParamsType value) {
        this.envParams = value;
    }

}
