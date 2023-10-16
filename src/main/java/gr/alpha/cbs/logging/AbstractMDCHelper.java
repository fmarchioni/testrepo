package gr.alpha.cbs.logging;

import gr.alpha.cbs.CBSConstants;
import gr.alpha.cbs.tools.XPathHelpers;

import org.slf4j.MDC;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import java.io.ByteArrayInputStream;
import java.util.Iterator;

public abstract class AbstractMDCHelper {


    String xpathRequestIdParam;
    String xpathSessionIdParam;
    String xpathBusinessCaseIdParam;
    String xpathSequenceIdParam;
    String xpathUserIdParam;
    String xpathCBSUnIdParam;
    String prefixWs;
    String namespaceWs;

    boolean LOGGER = false;

    protected void setupXPaths() {
        if (namespaceWs == null) {
            // Initialize from the configuration
            xpathRequestIdParam = "//*:RequestId/text()";
            xpathSessionIdParam ="/*:SessionId/text()";
            xpathBusinessCaseIdParam = "//*:BusinessCaseId/text()";
            xpathSequenceIdParam = "//*:SequenceId/text()";
            xpathUserIdParam = "//*:UserId/text()";
            xpathCBSUnIdParam = "//*:CBSUnId/text()";
            prefixWs = "cbsns";
            namespaceWs = "http://fuse.ml.cbs.alpha.gr/printing/";

 
        }
    }

    protected void setupMDCContext(Source input) {
        

        try {
            XPath xpath = XPathHelpers.getXPathFactory().newXPath();

            handleParameter(xpath, input, this.xpathRequestIdParam, CBSConstants.MDC_KEY_REQUEST_ID);
            handleParameter(xpath, input, this.xpathSessionIdParam, CBSConstants.MDC_KEY_SESSION_ID);
            handleParameter(xpath, input, this.xpathBusinessCaseIdParam, CBSConstants.MDC_KEY_BUSINESS_CASE_ID);
            handleParameter(xpath, input, this.xpathSequenceIdParam, CBSConstants.MDC_KEY_SEQUENCE_ID);
            handleParameter(xpath, input, this.xpathUserIdParam, CBSConstants.MDC_KEY_USER_ID);
            handleParameter(xpath, input, this.xpathCBSUnIdParam, CBSConstants.MDC_KEY_CBS_UN_ID);
        } catch (Exception e) {
            System.out.println("Unable to handle MDC parameters."+e.getMessage());
        }

    }

    protected void clearMDCContext() {
        MDC.remove(CBSConstants.MDC_KEY_REQUEST_ID);
        MDC.remove(CBSConstants.MDC_KEY_SESSION_ID);
        MDC.remove(CBSConstants.MDC_KEY_BUSINESS_CASE_ID);
        MDC.remove(CBSConstants.MDC_KEY_SEQUENCE_ID);
        MDC.remove(CBSConstants.MDC_KEY_USER_ID);
        MDC.remove(CBSConstants.MDC_KEY_CBS_UN_ID);
 
    }

    protected void handleParameter(XPath xpath, Source payload, String param, String logParam)
            throws NumberFormatException, Exception {
        if (LOGGER) {
            System.out.println("xpath:" + xpath + " param:" + param + " logParam:" + logParam);
        }

        xpath.setNamespaceContext(new NamespaceContext() {
            @Override
            public String getPrefix(String arg0) {
                throw new UnsupportedOperationException();
            }
            @Override
            public String getNamespaceURI(String prefix) {
                if (prefix == null )throw new NullPointerException();
                else if (prefixWs.equals(prefix))
                    return namespaceWs;
                return XMLConstants.NULL_NS_URI;
            }
            @Override
            public Iterator<String> getPrefixes(String namespaceURI) {
                return null;
            }
        });

        XPathExpression xpathExpression = xpath.compile(param);
        NodeList nodeList = (NodeList) xpathExpression.evaluate(((DOMSource)payload).getNode(), XPathConstants.NODESET);

        if (nodeList.getLength() == 1) {
            if (LOGGER) {
                System.out.println("Found log parameter value: " + nodeList.item(0).getTextContent());
            }

            if (!param.equals(this.xpathSequenceIdParam)) {
                MDC.put(logParam, nodeList.item(0).getTextContent());
            } else {
                Integer intValue;
                try {
                    intValue = Integer.parseInt(nodeList.item(0).getTextContent());
                } catch (Exception e) {
                    intValue = 0;
                }
                MDC.put(logParam, String.valueOf(++intValue));
            }
        } else {
            //throw new Exception("Cannot find parameter: " + param);
        }
    }

}
