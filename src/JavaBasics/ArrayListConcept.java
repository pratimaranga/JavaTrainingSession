package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);//index 0
		ar.add(200);//index 1
		ar.add(300);// index 2
				
		System.out.println(ar.size());
		
		ar.add(400); // index 3
		ar.add(500); // index 4
		
		System.out.println(ar.size());
		
		ar.add("Tom"); // index 5
		ar.add("Hello"); // index 6
		ar.add(12.33); // index 7
		ar.add('N'); // index 8
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));//  get(index) to get the value at index 4
		
		//System.out.println(ar.get(9));
		
		//to print all the values of ArrayList: use for loop
		
		for(int i =0;i < ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
	}

}
