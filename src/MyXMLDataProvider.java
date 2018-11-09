import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class MyXMLDataProvider {
	XPath xPath;
	Document doc;

	public MyXMLDataProvider(String dataxmlfilePath) throws Exception {
		File f = new File(dataxmlfilePath);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		doc = builder.parse(f);
		xPath = XPathFactory.newInstance().newXPath();

	}

	public String Read(String path) throws Exception {
 		NodeList nodeList = (NodeList) xPath.compile(path).evaluate(doc, XPathConstants.NODESET);
		return nodeList.item(0).getTextContent();

	}
}
