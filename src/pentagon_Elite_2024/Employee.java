package pentagon_Elite_2024;

class EmployeeDetails {
    int id;
    String name;
    double salary;

    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Employee {
    public static void main(String[] args) {
        // Array of Employee objects
        EmployeeDetails[] employees = {
            new EmployeeDetails(1, "Harsha", 20000),
            new EmployeeDetails(2, "Sandesh", 12000),
            new EmployeeDetails(3, "Naveen", 16000),
            new EmployeeDetails(4, "Rohan", 14000)
        };

       
        System.out.println("Employees with salary greater than 15000:");
        for (EmployeeDetails emp : employees) {
            if (emp.salary > 15000) {
                System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Salary: " + emp.salary);
            }
        }
    }
}
