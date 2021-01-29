package OOPConceptPart1;

public class LocalVsGlobalVariables {
// global variables
	String str ="Tom";
	int age =20;
	
	public static void main(String[] args) {
		int i =10; //local variable for main
		
		 System.out.println(i);
		 
		 LocalVsGlobalVariables obj= new LocalVsGlobalVariables();
		 String name= obj.str;
		 int age = obj.age;
		 System.out.println(obj.str);
		 System.out.println(obj.age);
		 System.out.println("Age of " + name +" is "+ age );
 
	}
 
	public void sum() {
		int i =15; //local variable for sum method
		int j= 20;
		int age= 20;
	}
}
