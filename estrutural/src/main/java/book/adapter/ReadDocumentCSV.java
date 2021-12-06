package book.adapter;

import java.util.ArrayList;
import java.util.List;

public class ReadDocumentCSV implements ReadDocument{

    @Override
    public List<Employee> readDocument() {
        List<Employee> employees = new ArrayList<>();
        System.out.println("csv");
        return employees;
    }
}
