package pentagon_Elite_2024;



class areaCalculation {
	
	
	
	void calculateShapearea(int a)
	{
		
		
		int c= a*a;
		System.out.println("Area of the Square is :"+c);
	}
	
	void calculateShapearea(int a , int b)
	{
		
		int c= (a*b);
		System.out.println("Area of the Rectangle is : "+c);
	}
	void calculateShapearea(int a ,double b)
	{
		
		int res = (int) (0.5*a*b);
		System.out.println("Area of the Triangle is :"+res);
	}
	void calculateShapearea(double a)
	{
		
		int res = (int) (3.14*a*a);
		System.out.println("Area of the Circle is :"+res);
	}
}

public class Shapes {

	public static void main(String[] args) {
		
		areaCalculation ad = new areaCalculation();
		ad.calculateShapearea(10);
		ad.calculateShapearea(7, 6.0);
		ad.calculateShapearea(5,6);
		ad.calculateShapearea(5.0);
		
		
	}
}
