package book.adapter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadDocumentXML implements ReadDocument{

    @Override
    public List<Employee> readDocument() {
        List<Employee> employees = new ArrayList<Employee>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("C:\\Users\\elias\\Desktop\\estudo\\design-pattern-comportamentais\\src\\br\\com\\me\\adapter\\employee.xml"));
            document.getDocumentElement().normalize();
            NodeList nList = document.getElementsByTagName("employee");
            for (int temp = 0; temp < nList.getLength(); temp++)
            {
                Node node = nList.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    String firstName = eElement.getElementsByTagName("FirstName").item(0).getTextContent();
                    String lastName = eElement.getElementsByTagName("LastName").item(0).getTextContent();
                    String email = eElement.getElementsByTagName("Email").item(0).getTextContent();
                    EmployeeAdapterXML employeeAdapterXML = new EmployeeAdapterXML(firstName, lastName, email);
                    employees.add(employeeAdapterXML);
                }
            }
            return employees;
        }
        catch (Exception exception){
            throw new IllegalArgumentException("Erro no arquivo");
        }

    }
}
