
package gr.alpha.cbs.ml.fuse.referencedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gr.alpha.cbs.ml.fuse.referencedata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoggingInfo_QNAME = new QName("http://fuse.ml.cbs.alpha.gr/ReferenceData/", "LoggingInfo");
    private final static QName _EnvParams_QNAME = new QName("http://fuse.ml.cbs.alpha.gr/ReferenceData/", "EnvParams");
    private final static QName _ErrorMessage_QNAME = new QName("http://fuse.ml.cbs.alpha.gr/ReferenceData/", "ErrorMessage");
    private final static QName _RefItemsTypeName_QNAME = new QName("http://fuse.ml.cbs.alpha.gr/ReferenceData/", "Name");
    private final static QName _RefItemsTypeVersion_QNAME = new QName("http://fuse.ml.cbs.alpha.gr/ReferenceData/", "Version");
    private final static QName _RefItemsTypeSystemsId_QNAME = new QName("http://fuse.ml.cbs.alpha.gr/ReferenceData/", "SystemsId");
    private final static QName _RequestDataTypeValue_QNAME = new QName("http://fuse.ml.cbs.alpha.gr/ReferenceData/", "Value");
    private final static QName _LoggingInfoTypeBusinessCaseId_QNAME = new QName("http://fuse.ml.cbs.alpha.gr/ReferenceData/", "BusinessCaseId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gr.alpha.cbs.ml.fuse.referencedata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoggingInfoType }
     * 
     */
    public LoggingInfoType createLoggingInfoType() {
        return new LoggingInfoType();
    }

    /**
     * Create an instance of {@link EnvParamsType }
     * 
     */
    public EnvParamsType createEnvParamsType() {
        return new EnvParamsType();
    }

    /**
     * Create an instance of {@link ErrorMessageType }
     * 
     */
    public ErrorMessageType createErrorMessageType() {
        return new ErrorMessageType();
    }

    /**
     * Create an instance of {@link GetListReferenceDataItem }
     * 
     */
    public GetListReferenceDataItem createGetListReferenceDataItem() {
        return new GetListReferenceDataItem();
    }

    /**
     * Create an instance of {@link GetListReferenceDataItemPayload }
     * 
     */
    public GetListReferenceDataItemPayload createGetListReferenceDataItemPayload() {
        return new GetListReferenceDataItemPayload();
    }

    /**
     * Create an instance of {@link GetListReferenceDataItemResponse }
     * 
     */
    public GetListReferenceDataItemResponse createGetListReferenceDataItemResponse() {
        return new GetListReferenceDataItemResponse();
    }

    /**
     * Create an instance of {@link GetListReferenceDataItemResponsePayload }
     * 
     */
    public GetListReferenceDataItemResponsePayload createGetListReferenceDataItemResponsePayload() {
        return new GetListReferenceDataItemResponsePayload();
    }

    /**
     * Create an instance of {@link TranslateData }
     * 
     */
    public TranslateData createTranslateData() {
        return new TranslateData();
    }

    /**
     * Create an instance of {@link TranslateDataPayload }
     * 
     */
    public TranslateDataPayload createTranslateDataPayload() {
        return new TranslateDataPayload();
    }

    /**
     * Create an instance of {@link TranslateDataResponse }
     * 
     */
    public TranslateDataResponse createTranslateDataResponse() {
        return new TranslateDataResponse();
    }

    /**
     * Create an instance of {@link TranslateDataResponsePayload }
     * 
     */
    public TranslateDataResponsePayload createTranslateDataResponsePayload() {
        return new TranslateDataResponsePayload();
    }

    /**
     * Create an instance of {@link UserRoleList }
     * 
     */
    public UserRoleList createUserRoleList() {
        return new UserRoleList();
    }

    /**
     * Create an instance of {@link AliasListType }
     * 
     */
    public AliasListType createAliasListType() {
        return new AliasListType();
    }

    /**
     * Create an instance of {@link RequestDataList }
     * 
     */
    public RequestDataList createRequestDataList() {
        return new RequestDataList();
    }

    /**
     * Create an instance of {@link RequestDataType }
     * 
     */
    public RequestDataType createRequestDataType() {
        return new RequestDataType();
    }

    /**
     * Create an instance of {@link ResponseDataList }
     * 
     */
    public ResponseDataList createResponseDataList() {
        return new ResponseDataList();
    }

    /**
     * Create an instance of {@link RefItemsType }
     * 
     */
    public RefItemsType createRefItemsType() {
        return new RefItemsType();
    }

    /**
     * Create an instance of {@link ResponseDataType }
     * 
     */
    public ResponseDataType createResponseDataType() {
        return new ResponseDataType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link TranslateDataRequestItem }
     * 
     */
    public TranslateDataRequestItem createTranslateDataRequestItem() {
        return new TranslateDataRequestItem();
    }

    /**
     * Create an instance of {@link TranslateDataResponseItem }
     * 
     */
    public TranslateDataResponseItem createTranslateDataResponseItem() {
        return new TranslateDataResponseItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoggingInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoggingInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://fuse.ml.cbs.alpha.gr/ReferenceData/", name = "LoggingInfo")
    public JAXBElement<LoggingInfoType> createLoggingInfo(LoggingInfoType value) {
        return new JAXBElement<LoggingInfoType>(_LoggingInfo_QNAME, LoggingInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvParamsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvParamsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://fuse.ml.cbs.alpha.gr/ReferenceData/", name = "EnvParams")
    public JAXBElement<EnvParamsType> createEnvParams(EnvParamsType value) {
        return new JAXBElement<EnvParamsType>(_EnvParams_QNAME, EnvParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://fuse.ml.cbs.alpha.gr/ReferenceData/", name = "ErrorMessage")
    public JAXBElement<ErrorMessageType> createErrorMessage(ErrorMessageType value) {
        return new JAXBElement<ErrorMessageType>(_ErrorMessage_QNAME, ErrorMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://fuse.ml.cbs.alpha.gr/ReferenceData/", name = "Name", scope = RefItemsType.class)
    public JAXBElement<String> createRefItemsTypeName(String value) {
        return new JAXBElement<String>(_RefItemsTypeName_QNAME, String.class, RefItemsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://fuse.ml.cbs.alpha.gr/ReferenceData/", name = "Version", scope = RefItemsType.class)
    public JAXBElement<Integer> createRefItemsTypeVersion(Integer value) {
        return new JAXBElement<Integer>(_RefItemsTypeVersion_QNAME, Integer.class, RefItemsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://fuse.ml.cbs.alpha.gr/ReferenceData/", name = "SystemsId", scope = RefItemsType.class)
    public JAXBElement<Integer> createRefItemsTypeSystemsId(Integer value) {
        return new JAXBElement<Integer>(_RefItemsTypeSystemsId_QNAME, Integer.class, RefItemsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://fuse.ml.cbs.alpha.gr/ReferenceData/", name = "Version", scope = RequestDataType.class)
    public JAXBElement<Integer> createRequestDataTypeVersion(Integer value) {
        return new JAXBElement<Integer>(_RefItemsTypeVersion_QNAME, Integer.class, RequestDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://fuse.ml.cbs.alpha.gr/ReferenceData/", name = "Value", scope = RequestDataType.class)
    public JAXBElement<String> createRequestDataTypeValue(String value) {
        return new JAXBElement<String>(_RequestDataTypeValue_QNAME, String.class, RequestDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://fuse.ml.cbs.alpha.gr/ReferenceData/", name = "BusinessCaseId", scope = LoggingInfoType.class)
    public JAXBElement<String> createLoggingInfoTypeBusinessCaseId(String value) {
        return new JAXBElement<String>(_LoggingInfoTypeBusinessCaseId_QNAME, String.class, LoggingInfoType.class, value);
    }

}
