import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class SVGWriter {
    public static void main(String[] args) {
        try {
            // Create a new SVG document
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            // Add root SVG element
            Element svgRoot = document.createElement("svg");
            svgRoot.setAttribute("xmlns", "http://www.w3.org/2000/svg");
            svgRoot.setAttribute("width", "200");
            svgRoot.setAttribute("height", "200");
            document.appendChild(svgRoot);

            // Add a rectangle
            Element rect = document.createElement("rect");
            rect.setAttribute("x", "10");
            rect.setAttribute("y", "10");
            rect.setAttribute("width", "100");
            rect.setAttribute("height", "100");
            rect.setAttribute("fill", "red");
            svgRoot.appendChild(rect);

            // Add some text
            Element text = document.createElement("text");
            text.setAttribute("x", "50");
            text.setAttribute("y", "150");
            text.setAttribute("font-size", "20");
            text.setAttribute("fill", "black");
            text.setTextContent("Hello, SVG!");
            svgRoot.appendChild(text);

            // Write the SVG document to a file
            saveSVGDocument(document, "bio.svg");

            System.out.println("SVG file created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to save the SVG document to a file
    private static void saveSVGDocument(Document document, String filePath) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(filePath));
            transformer.transform(domSource, streamResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

