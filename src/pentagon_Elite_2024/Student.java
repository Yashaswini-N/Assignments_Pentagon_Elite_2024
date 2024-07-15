package pentagon_Elite_2024;

import java.util.Scanner;

public class Student {
	
	public static void main(String[] args)
	{	
	
		
		String name;
        int roll, maths, english, science ,social;
         
        Scanner SC=new Scanner(System.in);
         
        System.out.print("Enter Name: ");
        name=SC.nextLine();
        System.out.print("Enter Roll Number: ");
        roll=SC.nextInt();
        System.out.print("Enter marks in Maths, English , science and social: ");
        maths=SC.nextInt();
        english=SC.nextInt();
        science=SC.nextInt();
        social=SC.nextInt();
         
        int total=maths+english+science+social;
        float perc=(float)total/400*100;
        
        
         
        System.out.println("Roll Number:" + roll +"\tName: "+name);
        System.out.println("Marks (Maths, English , science and social): " +maths+","+english+","+science+","+social);
        System.out.println("Total: "+total +"\tPercentage: "+perc);
        
        if(perc<35)
        {
        	System.out.println("Not eligible for next year");
        }
        else
        {
        	System.out.println("Eligible for next year");
        }
        
        

	   
	
}
}		
		