
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
 *         &lt;element name="TranslateDataPayload" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}TranslateDataPayload"/&gt;
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
    "translateDataPayload"
})
@XmlRootElement(name = "TranslateData")
public class TranslateData {

    @XmlElement(name = "TranslateDataPayload", required = true)
    protected TranslateDataPayload translateDataPayload;

    /**
     * Gets the value of the translateDataPayload property.
     * 
     * @return
     *     possible object is
     *     {@link TranslateDataPayload }
     *     
     */
    public TranslateDataPayload getTranslateDataPayload() {
        return translateDataPayload;
    }

    /**
     * Sets the value of the translateDataPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslateDataPayload }
     *     
     */
    public void setTranslateDataPayload(TranslateDataPayload value) {
        this.translateDataPayload = value;
    }

}
