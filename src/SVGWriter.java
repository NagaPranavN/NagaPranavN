package src;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class SVGOverwriteExample {
    public static void main(String[] args) {
        try {
            // Specify the path to the SVG file
            String filePath = "output.svg";

            // Create a new SVG document
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            // Add root SVG element
            Element svgRoot = document.createElement("svg");
            svgRoot.setAttribute("xmlns", "http://www.w3.org/2000/svg");
            svgRoot.setAttribute("width", "400");
            svgRoot.setAttribute("height", "200");
            document.appendChild(svgRoot);

            // Add a rectangle element
            Element rect = document.createElement("rect");
            rect.setAttribute("x", "50");
            rect.setAttribute("y", "50");
            rect.setAttribute("width", "300");
            rect.setAttribute("height", "100");
            rect.setAttribute("fill", "blue");
            svgRoot.appendChild(rect);
             
            // Add some text
            Element text = document.createElement("text");
            text.setAttribute("x", "50");
            text.setAttribute("y", "150");
            text.setAttribute("font-size", "20");
            text.setAttribute("fill", "black");
            text.setTextContent("Hello, SVG!");
            svgRoot.appendChild(text);
            // Overwrite the SVG file
            overwriteSVGFile(document, filePath);

            System.out.println("SVG file overwritten successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to overwrite an SVG file
    private static void overwriteSVGFile(Document document, String filePath) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filePath));

            // Transform and write the document to the file
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
           
