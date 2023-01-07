
public class Car {
	
	public static int var2;
	public int var1;

	public static void exampleStaticCarMethod() {
		
	//	this.var1 = 5;  cannot use this in static method.
	}
	
	public void exampleCarMethod() {
		
		this.var1= 5;
		System.out.println("Printingggg.........." + var1);
		
	}
}
