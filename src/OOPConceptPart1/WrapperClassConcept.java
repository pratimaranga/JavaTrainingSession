package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x ="100";
		System.out.println(x +20);
		
		//data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double conversion
		String  y ="12.33";
		double d = Double.parseDouble(y);
		System.out.println(10+d);
		
		//String to boolean
		String k ="true";
		 boolean b =  Boolean.parseBoolean(k);
		 System.out.println(k);
		 
		 //int to string conversion
		 int j =200;
		 System.out.println(j+20);// output 220
		 
		 String s = String.valueOf(j);
		 System.out.println(s+20);// output 20020
		 
		 String u ="100A";
		 Integer.parseInt(u); //output NumberFormatException
		 
		 System.out.println("practice work" );

	}

}
