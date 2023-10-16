package gr.alpha.cbs;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.w3c.dom.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.ws.rs.Produces;

public class RouteConfig extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        // from("direct:start").
        from("cxf:bean:referenceDataEndpoint?dataFormat=PAYLOAD").
                routeId("main").
                to("bean:createResponse").
                convertBodyTo(Document.class).
                to("bean:buildPojo");
    }

    @Produces
    @ApplicationScoped
    @Named("referenceDataEndpoint")
    CxfEndpoint referenceDataEndpoint() {
        final CxfEndpoint result = new CxfEndpoint();
        result.setServiceClass(CamelCXFExampleWS.class);
        result.setAddress("/ReferenceData");
        result.setWsdlURL("wsdl/ReferenceData.wsdl");
        return result;
    }

}
