package gr.alpha.cbs;

import gr.alpha.cbs.ml.fuse.referencedata.GetListReferenceDataItem;
import gr.alpha.cbs.ml.fuse.referencedata.GetListReferenceDataItemResponse;
import gr.alpha.cbs.ml.fuse.referencedata.TranslateData;
import gr.alpha.cbs.ml.fuse.referencedata.TranslateDataResponse;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(name = "ReferenceData",
        serviceName = "ReferenceData",
        portName = "ReferenceDataSOAP",
        targetNamespace = CamelCXFExampleWS.TARGET_NS)
//@HandlerChain(file = "/context.xml")

public interface CamelCXFExampleWS {
    public static final String TARGET_NS = "http://fuse.ml.cbs.alpha.gr/ReferenceData/";

    GetListReferenceDataItemResponse getListReferenceDataItem(GetListReferenceDataItem request);

    TranslateDataResponse translateData(TranslateData request);
}
