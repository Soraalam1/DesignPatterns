package abstractFactory;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class AbstractFactoryEverydayExample {
    public static void main(String[] args) {
        String xml = "<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        //DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        //Document type is not the same as his??
        //Document doc = factory.parse(bais);

    }
}
