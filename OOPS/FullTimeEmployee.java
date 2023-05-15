package emp;


public class FullTimeEmployee extends Employee // inheriting repeating thing from Employee
 {

    private int annualSalary;
    
    public FullTimeEmployee(int ID, String firstName, String lastName, int annualSalary) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;

        System.out.println("Full Time Emp");
    }
    
    @Override
    public int getMonthlySalary() {
        return annualSalary / 12;
    }
    
    // getters and setters
    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
}
