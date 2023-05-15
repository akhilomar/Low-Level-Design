package emp;


public class PartTimeEmployee extends Employee //inheritance
{
   
    public int HourlyPay;
    public int TotalNumberOfHour;
    
    public PartTimeEmployee(int ID, String firstName, String lastName, int annualSalary, int HourlyPay, int TotalNumberOfHour) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.HourlyPay = HourlyPay;
        this.TotalNumberOfHour = TotalNumberOfHour;
        System.out.println("Part Time Emp");
    }
    
    @Override
    public int getMonthlySalary()  // this is encapsulation, I don't know on what basis my salary is getting calculated
    {
        return HourlyPay * TotalNumberOfHour;
    }

}

