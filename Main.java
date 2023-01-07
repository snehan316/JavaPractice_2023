public class Main {
	
	
	// Note: A static method cannot access a class’s instance variables and instance methods, because a static method can be called even when no objects of the class have been instantiated.
	// For the same reason, the "this" reference cannot be used in a static method.
	//The "this" reference must refer to a specific object of the class, and when a static method is called, there might not be any objects of its class in memory.
	
	
	
	
	public int var1; // this cannot be used in the below static method since its not declared as a static variable
    public static int var2;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	var1 = 5; -> throws error as it is non-static variable
		var2 = 5; // works fine as it is declared as static var
		
		exampleStaticMethod();
		
	//	exampleMethod(); -> throws error as its a non-static method
		
		Car car = new Car();
		
		Car.exampleStaticCarMethod();
		car.exampleCarMethod();
		car.exampleStaticCarMethod(); // Not Advised to use it like this
		
		Car.var2 = 5;
		car.var1 = 5;
		car.var2 = 5;  //Not Advised to use it like this
		
		
		
		
	
	}
	
	public static void exampleStaticMethod() {
		
		Car car = new Car();
		System.out.println("Hereeeeeee");
		car.exampleCarMethod();
	//	Car.exampleCarMethod();   -> error
	
	}
	
	public void exampleMethod() {
		
		Car.exampleStaticCarMethod();
		//Car.exampleCarMethod(); -> error
		var2 = 5;
		
	}
	
	

}
