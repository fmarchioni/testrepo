package gr.alpha.cbs.logging;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

public  class LogicalLoggingHandler extends AbstractMDCHelper implements LogicalHandler<LogicalMessageContext> {

	public boolean handleMessage(LogicalMessageContext context) {
		return processMessage(context);
	}


	public boolean handleFault(LogicalMessageContext context) {
		return processMessage(context);
	}

	private boolean processMessageOut(LogicalMessageContext context) {
		clearMDCContext();

		return true;
	}

	private boolean processMessageIn(LogicalMessageContext context) {
		synchronized (this) {
			setupXPaths();
		}

		LogicalMessage lm = context.getMessage();
		Source payload = lm.getPayload();
		try {
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			Node rootNode = document.importNode(((DOMSource)payload).getNode(), true);
			document.appendChild(rootNode);
			payload = new DOMSource(document);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
		setupMDCContext(payload);

		return true;
	}

	private boolean processMessage(LogicalMessageContext context) {
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (outboundProperty) {
			
			return processMessageOut(context);

		} else {
			
			return processMessageIn(context);
		}
	}
	
	
	public void close(MessageContext context) {

	}

}
