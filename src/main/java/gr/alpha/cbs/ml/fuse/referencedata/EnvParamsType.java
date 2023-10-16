
package gr.alpha.cbs.ml.fuse.referencedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EnvParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkingDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PreviousWorkingDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="NextWorkingDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ValeurDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MachineDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ResourceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitCodeLevel1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UnitTypeCodeLevel1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UnitCodeLevel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitTypeCodeLevel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitCodeLevel3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitTypeCodeLevel3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitCodeLevel4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitTypeCodeLevel4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AliasList" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}AliasListType" minOccurs="0"/&gt;
 *         &lt;element name="ChannelTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResourceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReleaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PageKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardReaderPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessFlowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserRoleList" type="{http://fuse.ml.cbs.alpha.gr/ReferenceData/}UserRoleList" minOccurs="0"/&gt;
 *         &lt;element name="RelationValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationValue3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationValue4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalTypePoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalTypeRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseCurrency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvParamsType", propOrder = {
    "workingDate",
    "previousWorkingDate",
    "nextWorkingDate",
    "valeurDate",
    "machineDate",
    "resourceID",
    "resourceName",
    "unitCodeLevel1",
    "unitTypeCodeLevel1",
    "unitCodeLevel2",
    "unitTypeCodeLevel2",
    "unitCodeLevel3",
    "unitTypeCodeLevel3",
    "unitCodeLevel4",
    "unitTypeCodeLevel4",
    "aliasList",
    "channelTypeCode",
    "resourceTypeCode",
    "releaseType",
    "pageSize",
    "pageKey",
    "language",
    "userLanguage",
    "cardReaderPresent",
    "approvalID",
    "approvalType",
    "businessFlowName",
    "userRoleList",
    "relationValue1",
    "relationType1",
    "relationValue2",
    "relationType2",
    "relationValue3",
    "relationType3",
    "relationValue4",
    "relationType4",
    "approvalTypePoint",
    "approvalTypeRole",
    "baseCurrency"
})
public class EnvParamsType {

    @XmlElement(name = "WorkingDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar workingDate;
    @XmlElement(name = "PreviousWorkingDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar previousWorkingDate;
    @XmlElement(name = "NextWorkingDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextWorkingDate;
    @XmlElement(name = "ValeurDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valeurDate;
    @XmlElement(name = "MachineDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar machineDate;
    @XmlElement(name = "ResourceID", required = true)
    protected String resourceID;
    @XmlElement(name = "ResourceName")
    protected String resourceName;
    @XmlElement(name = "UnitCodeLevel1", required = true)
    protected String unitCodeLevel1;
    @XmlElement(name = "UnitTypeCodeLevel1", required = true)
    protected String unitTypeCodeLevel1;
    @XmlElement(name = "UnitCodeLevel2")
    protected String unitCodeLevel2;
    @XmlElement(name = "UnitTypeCodeLevel2")
    protected String unitTypeCodeLevel2;
    @XmlElement(name = "UnitCodeLevel3")
    protected String unitCodeLevel3;
    @XmlElement(name = "UnitTypeCodeLevel3")
    protected String unitTypeCodeLevel3;
    @XmlElement(name = "UnitCodeLevel4")
    protected String unitCodeLevel4;
    @XmlElement(name = "UnitTypeCodeLevel4")
    protected String unitTypeCodeLevel4;
    @XmlElement(name = "AliasList")
    protected AliasListType aliasList;
    @XmlElement(name = "ChannelTypeCode", required = true)
    protected String channelTypeCode;
    @XmlElement(name = "ResourceTypeCode", required = true)
    protected String resourceTypeCode;
    @XmlElement(name = "ReleaseType")
    protected String releaseType;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "PageKey")
    protected String pageKey;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "UserLanguage")
    protected String userLanguage;
    @XmlElement(name = "CardReaderPresent")
    protected Boolean cardReaderPresent;
    @XmlElement(name = "ApprovalID")
    protected String approvalID;
    @XmlElement(name = "ApprovalType")
    protected String approvalType;
    @XmlElement(name = "BusinessFlowName")
    protected String businessFlowName;
    @XmlElement(name = "UserRoleList")
    protected UserRoleList userRoleList;
    @XmlElement(name = "RelationValue1")
    protected String relationValue1;
    @XmlElement(name = "RelationType1")
    protected String relationType1;
    @XmlElement(name = "RelationValue2")
    protected String relationValue2;
    @XmlElement(name = "RelationType2")
    protected String relationType2;
    @XmlElement(name = "RelationValue3")
    protected String relationValue3;
    @XmlElement(name = "RelationType3")
    protected String relationType3;
    @XmlElement(name = "RelationValue4")
    protected String relationValue4;
    @XmlElement(name = "RelationType4")
    protected String relationType4;
    @XmlElement(name = "ApprovalTypePoint")
    protected String approvalTypePoint;
    @XmlElement(name = "ApprovalTypeRole")
    protected String approvalTypeRole;
    @XmlElement(name = "BaseCurrency")
    protected Integer baseCurrency;

    /**
     * Gets the value of the workingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkingDate() {
        return workingDate;
    }

    /**
     * Sets the value of the workingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkingDate(XMLGregorianCalendar value) {
        this.workingDate = value;
    }

    /**
     * Gets the value of the previousWorkingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousWorkingDate() {
        return previousWorkingDate;
    }

    /**
     * Sets the value of the previousWorkingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousWorkingDate(XMLGregorianCalendar value) {
        this.previousWorkingDate = value;
    }

    /**
     * Gets the value of the nextWorkingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextWorkingDate() {
        return nextWorkingDate;
    }

    /**
     * Sets the value of the nextWorkingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextWorkingDate(XMLGregorianCalendar value) {
        this.nextWorkingDate = value;
    }

    /**
     * Gets the value of the valeurDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValeurDate() {
        return valeurDate;
    }

    /**
     * Sets the value of the valeurDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValeurDate(XMLGregorianCalendar value) {
        this.valeurDate = value;
    }

    /**
     * Gets the value of the machineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMachineDate() {
        return machineDate;
    }

    /**
     * Sets the value of the machineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMachineDate(XMLGregorianCalendar value) {
        this.machineDate = value;
    }

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceID(String value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the resourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of the resourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * Gets the value of the unitCodeLevel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeLevel1() {
        return unitCodeLevel1;
    }

    /**
     * Sets the value of the unitCodeLevel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeLevel1(String value) {
        this.unitCodeLevel1 = value;
    }

    /**
     * Gets the value of the unitTypeCodeLevel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeCodeLevel1() {
        return unitTypeCodeLevel1;
    }

    /**
     * Sets the value of the unitTypeCodeLevel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeCodeLevel1(String value) {
        this.unitTypeCodeLevel1 = value;
    }

    /**
     * Gets the value of the unitCodeLevel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeLevel2() {
        return unitCodeLevel2;
    }

    /**
     * Sets the value of the unitCodeLevel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeLevel2(String value) {
        this.unitCodeLevel2 = value;
    }

    /**
     * Gets the value of the unitTypeCodeLevel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeCodeLevel2() {
        return unitTypeCodeLevel2;
    }

    /**
     * Sets the value of the unitTypeCodeLevel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeCodeLevel2(String value) {
        this.unitTypeCodeLevel2 = value;
    }

    /**
     * Gets the value of the unitCodeLevel3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeLevel3() {
        return unitCodeLevel3;
    }

    /**
     * Sets the value of the unitCodeLevel3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeLevel3(String value) {
        this.unitCodeLevel3 = value;
    }

    /**
     * Gets the value of the unitTypeCodeLevel3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeCodeLevel3() {
        return unitTypeCodeLevel3;
    }

    /**
     * Sets the value of the unitTypeCodeLevel3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeCodeLevel3(String value) {
        this.unitTypeCodeLevel3 = value;
    }

    /**
     * Gets the value of the unitCodeLevel4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeLevel4() {
        return unitCodeLevel4;
    }

    /**
     * Sets the value of the unitCodeLevel4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeLevel4(String value) {
        this.unitCodeLevel4 = value;
    }

    /**
     * Gets the value of the unitTypeCodeLevel4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeCodeLevel4() {
        return unitTypeCodeLevel4;
    }

    /**
     * Sets the value of the unitTypeCodeLevel4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeCodeLevel4(String value) {
        this.unitTypeCodeLevel4 = value;
    }

    /**
     * Gets the value of the aliasList property.
     * 
     * @return
     *     possible object is
     *     {@link AliasListType }
     *     
     */
    public AliasListType getAliasList() {
        return aliasList;
    }

    /**
     * Sets the value of the aliasList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasListType }
     *     
     */
    public void setAliasList(AliasListType value) {
        this.aliasList = value;
    }

    /**
     * Gets the value of the channelTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelTypeCode() {
        return channelTypeCode;
    }

    /**
     * Sets the value of the channelTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelTypeCode(String value) {
        this.channelTypeCode = value;
    }

    /**
     * Gets the value of the resourceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    /**
     * Sets the value of the resourceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceTypeCode(String value) {
        this.resourceTypeCode = value;
    }

    /**
     * Gets the value of the releaseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseType() {
        return releaseType;
    }

    /**
     * Sets the value of the releaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseType(String value) {
        this.releaseType = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageKey() {
        return pageKey;
    }

    /**
     * Sets the value of the pageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageKey(String value) {
        this.pageKey = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the userLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLanguage() {
        return userLanguage;
    }

    /**
     * Sets the value of the userLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLanguage(String value) {
        this.userLanguage = value;
    }

    /**
     * Gets the value of the cardReaderPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardReaderPresent() {
        return cardReaderPresent;
    }

    /**
     * Sets the value of the cardReaderPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardReaderPresent(Boolean value) {
        this.cardReaderPresent = value;
    }

    /**
     * Gets the value of the approvalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalID() {
        return approvalID;
    }

    /**
     * Sets the value of the approvalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalID(String value) {
        this.approvalID = value;
    }

    /**
     * Gets the value of the approvalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalType() {
        return approvalType;
    }

    /**
     * Sets the value of the approvalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalType(String value) {
        this.approvalType = value;
    }

    /**
     * Gets the value of the businessFlowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessFlowName() {
        return businessFlowName;
    }

    /**
     * Sets the value of the businessFlowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessFlowName(String value) {
        this.businessFlowName = value;
    }

    /**
     * Gets the value of the userRoleList property.
     * 
     * @return
     *     possible object is
     *     {@link UserRoleList }
     *     
     */
    public UserRoleList getUserRoleList() {
        return userRoleList;
    }

    /**
     * Sets the value of the userRoleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRoleList }
     *     
     */
    public void setUserRoleList(UserRoleList value) {
        this.userRoleList = value;
    }

    /**
     * Gets the value of the relationValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationValue1() {
        return relationValue1;
    }

    /**
     * Sets the value of the relationValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationValue1(String value) {
        this.relationValue1 = value;
    }

    /**
     * Gets the value of the relationType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationType1() {
        return relationType1;
    }

    /**
     * Sets the value of the relationType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationType1(String value) {
        this.relationType1 = value;
    }

    /**
     * Gets the value of the relationValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationValue2() {
        return relationValue2;
    }

    /**
     * Sets the value of the relationValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationValue2(String value) {
        this.relationValue2 = value;
    }

    /**
     * Gets the value of the relationType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationType2() {
        return relationType2;
    }

    /**
     * Sets the value of the relationType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationType2(String value) {
        this.relationType2 = value;
    }

    /**
     * Gets the value of the relationValue3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationValue3() {
        return relationValue3;
    }

    /**
     * Sets the value of the relationValue3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationValue3(String value) {
        this.relationValue3 = value;
    }

    /**
     * Gets the value of the relationType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationType3() {
        return relationType3;
    }

    /**
     * Sets the value of the relationType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationType3(String value) {
        this.relationType3 = value;
    }

    /**
     * Gets the value of the relationValue4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationValue4() {
        return relationValue4;
    }

    /**
     * Sets the value of the relationValue4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationValue4(String value) {
        this.relationValue4 = value;
    }

    /**
     * Gets the value of the relationType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationType4() {
        return relationType4;
    }

    /**
     * Sets the value of the relationType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationType4(String value) {
        this.relationType4 = value;
    }

    /**
     * Gets the value of the approvalTypePoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalTypePoint() {
        return approvalTypePoint;
    }

    /**
     * Sets the value of the approvalTypePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalTypePoint(String value) {
        this.approvalTypePoint = value;
    }

    /**
     * Gets the value of the approvalTypeRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalTypeRole() {
        return approvalTypeRole;
    }

    /**
     * Sets the value of the approvalTypeRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalTypeRole(String value) {
        this.approvalTypeRole = value;
    }

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseCurrency(Integer value) {
        this.baseCurrency = value;
    }

}
