
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
 *         &lt;element name="getListReferenceDataItemPayload" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}getListReferenceDataItemPayload"/&gt;
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
    "getListReferenceDataItemPayload"
})
@XmlRootElement(name = "getListReferenceDataItem")
public class GetListReferenceDataItem {

    @XmlElement(required = true)
    protected GetListReferenceDataItemPayload getListReferenceDataItemPayload;

    /**
     * Gets the value of the getListReferenceDataItemPayload property.
     * 
     * @return
     *     possible object is
     *     {@link GetListReferenceDataItemPayload }
     *     
     */
    public GetListReferenceDataItemPayload getGetListReferenceDataItemPayload() {
        return getListReferenceDataItemPayload;
    }

    /**
     * Sets the value of the getListReferenceDataItemPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetListReferenceDataItemPayload }
     *     
     */
    public void setGetListReferenceDataItemPayload(GetListReferenceDataItemPayload value) {
        this.getListReferenceDataItemPayload = value;
    }

}
