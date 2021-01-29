package OOPConceptPart2;

public class TestBank {
//if a class is implementing any Interface, than its mandetory to define/override all the methods of interface.
	
	public static void main(String[] args) {
		
		System.out.println("minmum bank balance is " + USBank.min_bal );
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.educationLoan();
		
		//dynamic polymorphism:
		//child class object can be referred by parent Interface variable
		
		USBank us = new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
		
		
	}

}
