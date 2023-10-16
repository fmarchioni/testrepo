
package gr.alpha.cbs.ml.fuse.referencedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getListReferenceDataItemResponsePayload" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}getListReferenceDataItemResponsePayload"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getListReferenceDataItemResponsePayload"
})
@XmlRootElement(name = "getListReferenceDataItemResponse")
public class GetListReferenceDataItemResponse {

    @XmlElement(required = true)
    protected GetListReferenceDataItemResponsePayload getListReferenceDataItemResponsePayload;

    /**
     * Gets the value of the getListReferenceDataItemResponsePayload property.
     * 
     * @return
     *     possible object is
     *     {@link GetListReferenceDataItemResponsePayload }
     *     
     */
    public GetListReferenceDataItemResponsePayload getGetListReferenceDataItemResponsePayload() {
        return getListReferenceDataItemResponsePayload;
    }

    /**
     * Sets the value of the getListReferenceDataItemResponsePayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetListReferenceDataItemResponsePayload }
     *     
     */
    public void setGetListReferenceDataItemResponsePayload(GetListReferenceDataItemResponsePayload value) {
        this.getListReferenceDataItemResponsePayload = value;
    }

}
