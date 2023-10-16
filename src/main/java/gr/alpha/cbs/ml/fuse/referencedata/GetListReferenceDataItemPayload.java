
package gr.alpha.cbs.ml.fuse.referencedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getListReferenceDataItemPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getListReferenceDataItemPayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestDataList" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}RequestDataList"/&gt;
 *         &lt;element ref="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}LoggingInfo"/&gt;
 *         &lt;element ref="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}EnvParams"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListReferenceDataItemPayload", propOrder = {
    "requestDataList",
    "loggingInfo",
    "envParams"
})
public class GetListReferenceDataItemPayload {

    @XmlElement(name = "RequestDataList", required = true)
    protected RequestDataList requestDataList;
    @XmlElement(name = "LoggingInfo", required = true)
    protected LoggingInfoType loggingInfo;
    @XmlElement(name = "EnvParams", required = true)
    protected EnvParamsType envParams;

    /**
     * Gets the value of the requestDataList property.
     * 
     * @return
     *     possible object is
     *     {@link RequestDataList }
     *     
     */
    public RequestDataList getRequestDataList() {
        return requestDataList;
    }

    /**
     * Sets the value of the requestDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDataList }
     *     
     */
    public void setRequestDataList(RequestDataList value) {
        this.requestDataList = value;
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
