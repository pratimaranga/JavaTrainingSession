package OOPConceptPart2;

public class HSBCBank implements USBank{
	
	public void credit() {
		
		System.out.println("hsbc --credit");
		
	}

	
	public void debit() {
		
		System.out.println("hsbc--debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc--transfer Money");
	}
	
	public void educationLoan() {
		
		System.out.println("hsbc -- edu loan");
	}
	
	public void carLoan() {
		
		System.out.println("hsbc-- car loan");
	}

}
