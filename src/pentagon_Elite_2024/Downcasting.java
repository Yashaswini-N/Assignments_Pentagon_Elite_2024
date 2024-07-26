package pentagon_Elite_2024;

class Chocolate1{
	public void addNuts(){
		
		System.out.println("Nuts and berries are added :");
	}
}

class DairyMilk1 extends Chocolate1 {
	 	
	@Override
	public void addNuts(){
		System.out.println("Nuts and berries are added");
		
	}
	
	public void addCaramel() {
		System.out.println("Caramel is added");
	}
	
}


public class Downcasting {
	
	public static void main(String[] args) {
		
		DairyMilk1 dm = new DairyMilk1();
		
		Chocolate1 c = dm;
		
		if(c instanceof DairyMilk1) {
			
			DairyMilk1 downcastDairyMilk1 = (DairyMilk1) c;
			
			downcastDairyMilk1.addCaramel();
		} else
		{
			System.out.println("The Object is not the instance of the subclass thats is DairyMilk1");
		}
	}

}
