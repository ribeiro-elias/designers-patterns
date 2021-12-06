package book.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

//        List<Employee> document = TypeDocument.CSV.getDocument();
        List<Employee> document1 = TypeDocument.XML.getDocument();

//        employees.addAll(document);
        employees.addAll(document1);

        employees.forEach(employee -> System.out.println(employee.getFirstName()));

    }
}
