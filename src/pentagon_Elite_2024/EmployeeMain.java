package pentagon_Elite_2024;

public class EmployeeMain {
    public static void main(String[] args) {
        
        int id1 = 1, id2 = 2, id3 = 3, id4 = 4;
        String name1 = "Poornima", name2 = "Harshitha", name3 = "Yashaswini", name4 = "Sanjay";
        double salary1 = 20000, salary2 = 12000, salary3 = 16000, salary4 = 14000;

        
        System.out.println("Employees with salary greater than 15000:");
        if (salary1 > 15000) {
            System.out.println("ID: " + id1 + ", Name: " + name1 + ", Salary: " + salary1);
        }
        if (salary2 > 15000) {
            System.out.println("ID: " + id2 + ", Name: " + name2 + ", Salary: " + salary2);
        }
        if (salary3 > 15000) {
            System.out.println("ID: " + id3 + ", Name: " + name3 + ", Salary: " + salary3);
        }
        if (salary4 > 15000) {
            System.out.println("ID: " + id4 + ", Name: " + name4 + ", Salary: " + salary4);
        }
    }
}
