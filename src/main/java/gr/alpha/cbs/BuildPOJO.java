package gr.alpha.cbs;

import gr.alpha.cbs.ml.fuse.referencedata.GetListReferenceDataItemResponse;
import gr.alpha.cbs.ml.fuse.referencedata.ItemType;
import gr.alpha.cbs.ml.fuse.referencedata.ObjectFactory;
import gr.alpha.cbs.ml.fuse.referencedata.RefItemsType;
//import io.quarkus.runtime.annotations.RegisterForReflection;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.sql.Ref;
import java.util.*;

@Named("buildPojo")
@ApplicationScoped
//@RegisterForReflection
public class BuildPOJO implements Processor {
    private static final Logger logger = LoggerFactory.getLogger(BuildPOJO.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        logger.info("In BuildPOJO::process() stage 1");

        Document document = exchange.getIn().getBody(Document.class);
        NodeList rows = document.getElementsByTagName("Item");
        Set<ReferenceDataItem> set = fillSetOfRefItems(rows);

        logger.info("In BuildPOJO::process() stage 2");
        ObjectFactory factory = new ObjectFactory();
        GetListReferenceDataItemResponse response = factory.createGetListReferenceDataItemResponse();
        response.setGetListReferenceDataItemResponsePayload(factory.createGetListReferenceDataItemResponsePayload());
        response.getGetListReferenceDataItemResponsePayload().setResponseDataList(factory.createResponseDataList());
        List<RefItemsType> refItems = response.getGetListReferenceDataItemResponsePayload().getResponseDataList().getRefItems();

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            RefItemsType refItem = factory.createRefItemsType();
            refItem.setName(factory.createRefItemsTypeName(UUID.randomUUID().toString()));
            refItem.setLanguageId(random.nextInt());
            refItem.setValue(UUID.randomUUID().toString());
            refItem.setVersion(factory.createRefItemsTypeVersion(random.nextInt()));
            refItem.setSystemsId(factory.createRefItemsTypeSystemsId(random.nextInt()));
            refItem.setReferenceData(factory.createResponseDataType());
            List<ItemType> items = refItem.getReferenceData().getItem();
            for (ReferenceDataItem referenceDataItem : set) {
                ItemType item = factory.createItemType();
                item.setMember(referenceDataItem.getMember());
                item.setValue(UUID.randomUUID().toString());
                item.setStartDate(UUID.randomUUID().toString());
                item.setEndDate(UUID.randomUUID().toString());
                item.setIsActive(UUID.randomUUID().toString());
                items.add(item);
            }
            refItems.add(refItem);
        }

        exchange.getIn().setBody(response);
    }

    private Set<ReferenceDataItem> fillSetOfRefItems(NodeList rows) {
        Set<ReferenceDataItem> set = new LinkedHashSet<>();
        for(int j=0; j<rows.getLength(); j++){
            Element el = (Element) rows.item(j);
            ReferenceDataItem refItem= new ReferenceDataItem();
            refItem.setMember(el.getElementsByTagName("Member").item(0).getTextContent());
            refItem.setValue(el.getElementsByTagName("Value").item(0).getTextContent());
            //check if it is returned from db
            if (el.getElementsByTagName("StartDate").getLength()>0){
                refItem.setStartDate(el.getElementsByTagName("StartDate").item(0).getTextContent());
            }
            if (el.getElementsByTagName("EndDate").getLength()>0){
                refItem.setEndDate(el.getElementsByTagName("EndDate").item(0).getTextContent());
            }

            set.add(refItem);
        }

        return set;

    }

}
