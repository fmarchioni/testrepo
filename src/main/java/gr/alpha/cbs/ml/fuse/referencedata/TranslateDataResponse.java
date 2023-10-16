
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
 *         &lt;element name="TranslateDataResponsePayload" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}TranslateDataResponsePayload"/&gt;
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
    "translateDataResponsePayload"
})
@XmlRootElement(name = "TranslateDataResponse")
public class TranslateDataResponse {

    @XmlElement(name = "TranslateDataResponsePayload", required = true)
    protected TranslateDataResponsePayload translateDataResponsePayload;

    /**
     * Gets the value of the translateDataResponsePayload property.
     * 
     * @return
     *     possible object is
     *     {@link TranslateDataResponsePayload }
     *     
     */
    public TranslateDataResponsePayload getTranslateDataResponsePayload() {
        return translateDataResponsePayload;
    }

    /**
     * Sets the value of the translateDataResponsePayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslateDataResponsePayload }
     *     
     */
    public void setTranslateDataResponsePayload(TranslateDataResponsePayload value) {
        this.translateDataResponsePayload = value;
    }

}
