
package gr.alpha.cbs.ml.fuse.referencedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getListReferenceDataItemResponsePayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getListReferenceDataItemResponsePayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseDataList" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}ResponseDataList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}LoggingInfo"/&gt;
 *         &lt;element ref="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}ErrorMessage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListReferenceDataItemResponsePayload", propOrder = {
    "responseDataList",
    "loggingInfo",
    "errorMessage"
})
public class GetListReferenceDataItemResponsePayload {

    @XmlElement(name = "ResponseDataList")
    protected ResponseDataList responseDataList;
    @XmlElement(name = "LoggingInfo", required = true)
    protected LoggingInfoType loggingInfo;
    @XmlElement(name = "ErrorMessage")
    protected ErrorMessageType errorMessage;

    /**
     * Gets the value of the responseDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataList }
     *     
     */
    public ResponseDataList getResponseDataList() {
        return responseDataList;
    }

    /**
     * Sets the value of the responseDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataList }
     *     
     */
    public void setResponseDataList(ResponseDataList value) {
        this.responseDataList = value;
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

}
