import emp.PartTimeEmployee;
import emp.FullTimeEmployee;

public class Main {
    public static void main(String[] args) throws Exception {
        FullTimeEmployee obj1 = new FullTimeEmployee(0, "Akhil", "Omar", 60000);
        // PartTimeEmployee obj2 = new PartTimeEmployee(0, null, null, 0, 0, 0);
        obj1.GetFullName();


        PartTimeEmployee obj2 = new PartTimeEmployee(0, "Tushar", "Rastogi", 0, 0, 0);
        obj2.GetFullName();

    }
}

