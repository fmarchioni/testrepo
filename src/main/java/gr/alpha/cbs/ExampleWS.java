package gr.alpha.cbs;

import gr.alpha.cbs.tools.XPathHelpers;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.support.DefaultExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.inject.Inject;
import javax.jws.HandlerChain;
import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.Provider;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;
import java.util.Map;

//@ServiceMode(value = Service.Mode.PAYLOAD)
@HandlerChain(file = "/context.xml")
//@WebServiceProvider(portName = "ReferenceDataSOAP", serviceName = "ReferenceData", targetNamespace = "http://fuse.ml.cbs.alpha.gr/ReferenceData/", wsdlLocation = "/wsdl/ReferenceData.wsdl")
public class ExampleWS  implements Provider<DOMSource> {
    private static final Logger logger = LoggerFactory.getLogger(ExampleWS.class);

    @Inject
    CamelContext camelContext;

    @Override
    public DOMSource invoke(DOMSource domSource) {
        DOMSource response = new DOMSource();
        try {
            long startTime = System.currentTimeMillis();

            ProducerTemplate producerTemplate = camelContext.createProducerTemplate();
            logger.info("Call web service RequestBody:\n" + XPathHelpers.nodeToString(domSource.getNode(), "yes", "no"));

            Exchange exchange = new DefaultExchange(camelContext);
            exchange.getIn().setBody(domSource.getNode());
            Object r = producerTemplate.send("direct:start", exchange).getIn().getBody();
            Document s = camelContext.getTypeConverter().convertTo(Document.class, r);

            long duration = System.currentTimeMillis() - startTime;

            logger.info("Call web service  Took " + duration + "ms. " + "ResponseBody:\n"
                    + XPathHelpers.nodeToString(s, "yes", "no").substring(0, 10000));

            response.setNode(s);
        } catch (Exception e) {
            logger.error("Unable to process request.", e);
        }
        return response;
    }
}
