import java.time.Year;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String pesel;
    private int yearOfEmployment;
    private static final int BASE_SALARY = 3000;
    private static final int YEARLY_INCREMENT = 1000;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateBaseSalary() {
        int currentYear = Year.now().getValue();
        int yearsWorked = currentYear - yearOfEmployment;
        return BASE_SALARY + (yearsWorked * YEARLY_INCREMENT);
    }

    public abstract int calculateSalary();
}
