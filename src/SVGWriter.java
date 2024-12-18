package src;
import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.svg.SVGDocument;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SVGWriter {

    public void svgfunction() throws Exception {
        String svgFilePath = "bio.svg";
        SVGDocument svgDocument = parseSVG(svgFilePath);

        updateSVGElement(svgDocument, "myRect", "width", "200");
        updateSVGElement(svgDocument, "myRect", "height", "150");

        saveUpdatedSVG(svgDocument, "bio1.svg");
    }
    
    public static SVGDocument parseSVG(String svgFilePath) throws Exception {
        String parser = XMLResourceDescriptor.getXMLParserClassName();
        SAXSVGDocumentFactory factory = new SAXSVGDocumentFactory(parser);
        return (SVGDocument) factory.createDocument(new File(svgFilePath).toURI().toString());
    }

    public static void updateSVGElement(SVGDocument svgDocument, String elementId, String attributeName, String attributeValue) {
        Node node = svgDocument.getElementById(elementId);
        if (node != null && node instanceof Element) {
            Element element = (Element) node;
            element.setAttribute(attributeName, attributeValue);
        }
    }

    public static void saveUpdatedSVG(SVGDocument svgDocument, String outputFilePath) throws IOException {
        try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(new javax.xml.transform.dom.DOMSource(svgDocument), new StreamResult(fileWriter));
        } catch (Exception e) {
            throw new IOException("Error saving the updated SVG file", e);
        }
    }
}
