package book.adapter;

public class EmployeeAdapterXML implements Employee{
    private final String firstName;
    private final String lastName;
    private final String email;


    public EmployeeAdapterXML(String firstname, String lastname, String email) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = email;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
