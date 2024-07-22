package pentagon_Elite_2024;

import java.util.Scanner;



interface FlightBooking

{
	
	// abstract void checkAvailability();
	abstract boolean checkAvailability();
	static void disp()
	{
		System.out.println("checking flights availability");
	}
	default void print()
	{
		System.out.println("Hello from default");
	}
}

class Airasia implements FlightBooking
{

	@Override
	public boolean checkAvailability() {
		
		
		System.out.println("Airasia Flights are available on 18-07-2024");
		return true;
		
		}

		
   public void placeOrder()
   {
	   int available_seats = 50;
	   int noofSeats = 0;
	   int price = 1000;
	  // if(checkAvailability() == true)
	   System.out.println("The availability of seats in Airasia :"+available_seats);
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the no of seats to be booked in Airasia :"+noofSeats);
	   noofSeats = sc.nextInt();
	   int totalPrice = price * noofSeats;
	   System.out.println("Total amount of the seats booked in Airasia flight :"+totalPrice);
	   int finalavailable_seats = available_seats - noofSeats;
	   System.out.println("Final available seats in Airasia are :"+finalavailable_seats);
  }
	
}

class Indigo implements FlightBooking
{

	@Override
	public boolean checkAvailability() {
		
		System.out.println("Indigo Flights are available on 18-07-2024");
		return true;
		
	}
	public void placeOrder()
	   {
		   int available_seats = 50;
		   int noofSeats = 0;
		   int price = 1000;
		  // if(checkAvailability() == true)
		   System.out.println("The availability of seats in Indigo are :"+available_seats);
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the no of seats to be booked in Indigo is :"+noofSeats);
		   noofSeats = sc.nextInt();
		   int totalPrice = price * noofSeats;
		   System.out.println("Total amount of the seat booked in Indigo :"+totalPrice);
		   int finalavailable_seats = available_seats - noofSeats;
		   System.out.println("Final available seats Indigo are :"+finalavailable_seats);
		   
	  }
	
}



public class FlightApplication {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n1. AirAsia\n"+"2. Indigo\n"+"4. Exit\n");
			System.out.print("Choose Flights to check Seat availability: ");
			int choice = sc.nextInt();
			if(choice == 1) {
				
				Airasia asia =new Airasia();
				asia.checkAvailability();
				asia.placeOrder();
			}
			else if(choice == 2) {
				
				Indigo indigo =new Indigo();
				indigo.checkAvailability();
				indigo.placeOrder();
			}
			else if(choice == 3) {
				System.out.println("Thankyou for booking, have a Safe Journey");
				break;
			}else
			{
				System.out.println("invalid choice");
			}
			
			
}
	}
}
