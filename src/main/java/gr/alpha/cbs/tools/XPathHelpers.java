package gr.alpha.cbs.tools;

import net.sf.saxon.s9api.Processor;
import net.sf.saxon.s9api.Serializer;
import net.sf.saxon.s9api.SaxonApiException;
import net.sf.saxon.s9api.XdmNode;
 
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class XPathHelpers {
   
   static  boolean LOGGER=false;
    private static final ThreadLocal<XPathFactory> XPATH_FACTORY = new ThreadLocal<XPathFactory>()
    {
        @Override
        protected XPathFactory initialValue()
        {
            try {
                return XPathFactory.newInstance("http://saxon.sf.net/jaxp/xpath/om","net.sf.saxon.xpath.XPathFactoryImpl", null);
            } catch (XPathFactoryConfigurationException e) {

                System.out.println(e.getStackTrace());
            }
            return XPathFactory.newInstance();

        }
    };


    public static XPathFactory getXPathFactory(){
        return XPATH_FACTORY.get();
    }

    public static XPath getXpath(Map<String,String> m) {
        Long timer = System.nanoTime();
        if (LOGGER){
            System.out.println("getXpath Started");
        }
        //XPath xPath = new net.sf.saxon.xpath.XPathFactoryImpl().newXPath();

        XPath xPath = XPATH_FACTORY.get().newXPath();
        if (m!=null){
            try {

                xPath.setNamespaceContext(new NamespaceContext() {

                    @Override
                    public Iterator<String> getPrefixes(String arg0) {
                        throw new UnsupportedOperationException();
                    }

                    @Override
                    public String getPrefix(String arg0) {
                        throw new UnsupportedOperationException();
                    }

                    @Override
                    public String getNamespaceURI(String prefix) {
                        if (prefix == null )throw new NullPointerException();
                        else if (m != null && m.get(prefix) != null){
                            return m.get(prefix);
                        } else {
                            return XMLConstants.NULL_NS_URI;
                        }
                    }
                });

            } catch (Exception e) {
               e.printStackTrace();
            }
        }


        if (LOGGER ){
            timer = System.nanoTime() - timer;
            System.out.println("getXpath took " + timer/1000 + " microsec");
        }
        return xPath;

    }

    public static String getValueXpath(XPath xPath, Document doc, String value) {

        if (LOGGER) {
            System.out.println("getValueXpath:" + value);
        }

        String retVal = "";
        Long timer = System.nanoTime();
        try {


            XPathExpression expr;
            expr = xPath.compile(value + "/text()");
            retVal = (String) expr.evaluate(doc, XPathConstants.STRING);

            timer = System.nanoTime() - timer;
        } catch (Exception e) {
           e.printStackTrace();
            //e.printStackTrace();
        }


        if (LOGGER){
            System.out.println("xPath:" + xPath + " getValueXpath:" + value + " took:" + timer /1000 + " micro," + "retVal:" + retVal);
        }

        return retVal;
    }

    /**
     * Converts a org.w3c.dom.Node to human Readable String
     * @param node The node to be converted
     * @return A string of an xml Node
     */
    public static String nodeToString(Node node, String omitXmlDeclr, String indent, String method, String encoding) throws TransformerException {
        try {
            Processor processor = new Processor(false);
            XdmNode source = processor.newDocumentBuilder().wrap(node);
            Serializer serializer = processor.newSerializer();
            serializer.setOutputProperty(Serializer.Property.OMIT_XML_DECLARATION, omitXmlDeclr);
            serializer.setOutputProperty(Serializer.Property.INDENT, indent);
            if (method != null) {
                serializer.setOutputProperty(Serializer.Property.METHOD, method);
                serializer.setOutputProperty(Serializer.Property.ENCODING, encoding);
            }
            return serializer.serializeNodeToString(source);
        } catch (SaxonApiException e) {
            throw new TransformerException(e);
        }
    }

    public static String nodeToString(Node node, String omitXmlDeclr, String indent) throws TransformerException {
        return nodeToString(node, omitXmlDeclr, indent, null, null);
    }

    public static XPath getXPath(final String namespace, final String namespacePrefix) {
        XPath xpath = XPathFactory.newDefaultInstance().newXPath();
        xpath.setNamespaceContext(new NamespaceContext() {

            @Override
            public String getNamespaceURI(String prefix) {
                if (prefix == null) {
                    throw new NullPointerException();
                } else if (namespacePrefix.equals(prefix)) {
                    return namespace;
                }
                return XMLConstants.NULL_NS_URI;
            }

            @Override
            public String getPrefix(String namespaceURI) {
                if (namespace != null && namespace.equals(namespaceURI)) {
                    return namespacePrefix;
                }
                return null;
            }

            @Override
            public Iterator<String> getPrefixes(String namespaceURI) {
                if (namespace != null && namespace.equals(namespaceURI)) {
                    return Collections.singletonList(namespacePrefix).iterator();
                }
                return null;
            }
        });
        return xpath;
    }

    private XPathHelpers() {
        // Intentionally empty
    }
}
