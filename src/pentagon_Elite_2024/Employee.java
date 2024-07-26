package pentagon_Elite_2024;

import java.util.Scanner;

/*
 * for(datatype ref : List_of_data)
 * 
 * 
 */

class EmployeeDetails {
    int id;
    String name;
    double salary;
    String designation;

    public EmployeeDetails(int id, String name, double salary, String designation) {
    	
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        
    }
    
    void getEmpDetails()
    {
    	System.out.println("Emp id :"+id);
    	System.out.println("Emp name :"+name);
    	System.out.println("salary :"+salary);
    	System.out.println("designation :"+designation);
    }
}

public class Employee {
    public static void main(String[] args) {
        // Array of Employee objects
//        EmployeeDetails[] employees = {
//            new EmployeeDetails(1, "Harsha", 20000,"Tester"),
//            new EmployeeDetails(2, "Sandesh", 12000,"Sales"),
//            new EmployeeDetails(3, "Naveen", 16000,"Coordinator"),
//            new EmployeeDetails(4, "Rohan", 14000,"Junior Tester")
//        };
       
    	EmployeeDetails e1 = new EmployeeDetails(1, "Harsha", 20000,"Tester");
    	EmployeeDetails e2 = new EmployeeDetails(2, "Sandesh", 12000,"Sales");
    	EmployeeDetails e3 = new EmployeeDetails(3, "Naveen", 16000,"Coordinator");
    	EmployeeDetails e4 = new EmployeeDetails(4, "Rohan", 14000,"Junior Tester");
    	EmployeeDetails e5 = new EmployeeDetails(5,"Shaskhi",40000,"Developer");
    	
       
//        System.out.println("Employees with salary greater than 15000:");
//        for (EmployeeDetails emp : employees) {
//            if (emp.salary > 15000) {
//                System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Salary: " + emp.salary);
    	
    	EmployeeDetails emparr[] = {e1,e2,e3,e4,e5};
    	
    	for(EmployeeDetails emp : emparr)//emp = e1,emp=e2,emp=e3
    	{
    		if(emp.salary>15000) {
    		emp.getEmpDetails();
    	}
    	
        }
        }
}
    

