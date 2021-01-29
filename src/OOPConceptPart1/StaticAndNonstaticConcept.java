package OOPConceptPart1;

public class StaticAndNonstaticConcept {
	
	String name ="Tom";// non static global variable
	static int age =25; //static global variable

	public static void main(String[] args) {
		// how to call static method and variables
        //1. by direct calling
		sum();
		System.out.println(age);
		
		//2. calling by classname
		StaticAndNonstaticConcept.sum();
		System.out.println(StaticAndNonstaticConcept.age);
	
		//how to call non static methods and variable
		
		StaticAndNonstaticConcept obj = new StaticAndNonstaticConcept();
		
		obj.sendMail();
		System.out.println(obj.name);
	
		//can I access static method by object reference? Yes
		obj.sum();// warning will be given
	}

	public void sendMail() {// non static method
		
		System.out.println("Send mail method");
		
	}
	
	public static void sum() {//static method
		
		System.out.println("Sum method");
	}
	
}
