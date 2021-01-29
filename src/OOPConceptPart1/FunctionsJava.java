package OOPConceptPart1;

public class FunctionsJava {

	//main method is the starting point of execution
	
	public static void main(String[] args) {
		
		FunctionsJava obj = new FunctionsJava();
		//one object will be created, obj is object reference variable, referring to this object
		//after creating the object, the copy of all non static methods will be given to this object
		
		obj.test();
		
		
		int l = obj.pqr();
		System.out.println(l);
		
		int val= obj.division(40, 5);
		System.out.println("value of divisio is " + val);
		
		String str=obj.qa();
		System.out.println("String is "+ str);
 
		
		//main method is void- becAUSE we never returns a value IN MAIN nethod
	}
	
	
	//non Static methods
	
	
	public void test() {
		
		System.out.println("test method");
	}
	
	public int pqr() {
		System.out.println("pqr method");
		int a = 10;
		int b =20;
		int c = a+b;
		
		return c;
	}
 
	public String qa() {
		System.out.println("qa method");
		
		String s= "beautiful";
		return s;
		
	}
	
	
	//x,y --> input parameter/argumen
	
	public int division(int x, int y) {
		
		System.out.println("division method");
		
		int d= x/y;
		
		return d;
	}
}
