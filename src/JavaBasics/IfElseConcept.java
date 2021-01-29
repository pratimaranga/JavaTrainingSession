package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
   int a = 10;
   int b = 20;
   
   if(b>a) {
	   
	   System.out.println("b is greater than a");
   }
   else {
	   System.out.println("a is greater than b");
    }
   
   //Comparison operators
   // < > >= <= == !=
   
   int c =40;
   int d = 50;
    if (c==d) {
    	
    	System.out.println("c and d are equal" );
    }
    else {
    	System.out.println("c and d are not equal");
    }
    
    // write a logic to find a highest no
    
    int a1 =500;
    int b1 =200;
    int c1 =300;
    
    if ( a1>b1 & a1>c1) {
    	System.out.println("a1 is the highest no.");
    }
    else if( c1>b1) {
       System.out.println("c1 is the highest no." );
    
    } 
    else {
      System.out.println("b1 is the highest no.");
    }

 }

}