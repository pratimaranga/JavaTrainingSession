package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
     obj.sum();
     obj.sum(10);
     obj.sum(10, 5);
		
	}
	// Yes we can overload main method, though we don't
	public static void main(int i) {
		
	}
	
	public static void main(int k, int l ) {
		
	}
	
	//Method Overloading-->when the name of method name is same with different arguments or parameter and different datatypes  within the same class
	
	public void sum() {
		
		// zero input parameter
		System.out.println("Sum method-- 0 input param");
	}
	
    
	public void sum( int i) {
		
		// 1 input parameter
		System.out.println("Sum method-- 1 input param");
		System.out.println(i);
	}

    public void sum(int k, int l) {
	
	  // 2 input parameter
	  System.out.println("Sum method-- 2 input param");
	  System.out.println(k*l);
   
    }

}
