
package gr.alpha.cbs.ml.fuse.referencedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestDataList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestDataList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestData" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}RequestDataType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDataList", propOrder = {
    "requestData"
})
public class RequestDataList {

    @XmlElement(name = "RequestData", required = true)
    protected List<RequestDataType> requestData;

    /**
     * Gets the value of the requestData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestDataType }
     * 
     * 
     */
    public List<RequestDataType> getRequestData() {
        if (requestData == null) {
            requestData = new ArrayList<RequestDataType>();
        }
        return this.requestData;
    }

}
