package gr.alpha.cbs;

import gr.alpha.cbs.tools.XPathHelpers;
//import io.quarkus.runtime.annotations.RegisterForReflection;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

@Named("createResponse")
@ApplicationScoped
//@RegisterForReflection
public class CreateResponse implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        File file = new File(getClass().getResource("/largeFile.xml").getFile());
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        String s = XPathHelpers.nodeToString(document, "yes", "no");
        exchange.getIn().setBody(s);
    }
}
