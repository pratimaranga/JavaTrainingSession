package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//static polymorphism  or compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refule();
		b.theftSafety();
		b.engine();
		
		System.out.println("*****");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refule();
		
		System.out.println("*****");
		
		new BMW(); //object of BMW class
		
		//Top casting
		Car c1 = new BMW();// child class object can be referred by parent class object variable--called Dynamic Polymorhism Or 
				 //Run time Polymorphism
		 c1.start();// child class method is called
		 c1.stop();
		 c1.refule();
		 
		 //Down casting is possible but  it will give Class cast exception
		 
		// BMW b1 = new Car();// not possible
		 
		 BMW b1 = (BMW)new Car();//it becomes BMW class object:: will give Class Cast Exception at compile time
		 
		 
	}

}
