package emp;

// This is design level, other class are implementation level
// Abstraction : basic necessity 
public abstract class Employee {
    public int ID;
    public String firstName;
    public String lastName;

    public String GetFullName(){
        System.out.println(this.firstName + " " + this.lastName);
        return this.firstName + " " + this.lastName;
    }

    public abstract int getMonthlySalary();
}
