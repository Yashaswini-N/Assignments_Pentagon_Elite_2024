package pentagon_Elite_2024;

class Chocolate{
	public void addNuts(){
		
		System.out.println("Nuts and berries are added :");
	}
}

class DairyMilk extends Chocolate {
	 	
	@Override
	public void addNuts(){
		System.out.println("Nuts and berries are added");
		
	}
	
	public void addCaramel() {
		System.out.println("Caramel is added");
	}
	
}

public class Upcasting {
	
	public static void main(String[] args) {
		
		DairyMilk dm = new DairyMilk();
		
		Chocolate c = dm;
		
		c.addNuts();
	}

}
