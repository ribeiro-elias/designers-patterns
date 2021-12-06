package book.adapter;

public class EmployeeAdapterCSV implements Employee {
    private String csv;

    public EmployeeAdapterCSV(String csv){
        this.csv = csv;
    }

    @Override
    public String getFirstName() {
        return csv;
    }

    @Override
    public String getLastName() {
        return csv;
    }

    @Override
    public String getEmail() {
        return csv;
    }
}
