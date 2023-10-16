
package gr.alpha.cbs.ml.fuse.referencedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranslateDataResponsePayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranslateDataResponsePayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TranslateDataResponseItem" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}TranslateDataResponseItem" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}ErrorMessageType" minOccurs="0"/&gt;
 *         &lt;element name="LoggingInfo" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}LoggingInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslateDataResponsePayload", propOrder = {
    "translateDataResponseItem",
    "errorMessage",
    "loggingInfo"
})
public class TranslateDataResponsePayload {

    @XmlElement(name = "TranslateDataResponseItem")
    protected TranslateDataResponseItem translateDataResponseItem;
    @XmlElement(name = "ErrorMessage")
    protected ErrorMessageType errorMessage;
    @XmlElement(name = "LoggingInfo", required = true)
    protected LoggingInfoType loggingInfo;

    /**
     * Gets the value of the translateDataResponseItem property.
     * 
     * @return
     *     possible object is
     *     {@link TranslateDataResponseItem }
     *     
     */
    public TranslateDataResponseItem getTranslateDataResponseItem() {
        return translateDataResponseItem;
    }

    /**
     * Sets the value of the translateDataResponseItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslateDataResponseItem }
     *     
     */
    public void setTranslateDataResponseItem(TranslateDataResponseItem value) {
        this.translateDataResponseItem = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageType }
     *     
     */
    public ErrorMessageType getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageType }
     *     
     */
    public void setErrorMessage(ErrorMessageType value) {
        this.errorMessage = value;
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

}
