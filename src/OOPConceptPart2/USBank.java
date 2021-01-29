package OOPConceptPart2;

public interface USBank {
	//only method declaration
	//no method body- only method prototype
	//in interface, we can declare the variable, they are by default static in nature
	// variables value will not be changed
	// no static methods are allowed in interface
	// no main method in interface
	// we can not create the object of interface
	// interface is abstract in nature
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();

}
