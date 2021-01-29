package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// int array
		//lowest index is 0
		// highest index is n-1 where n is the size of array
		int i[] = new int[4];
		i[0] =10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		System.out.println(i[0]);
			
		//System.out.println(i[4]);//ArrayIndexOutofBoundsException
		
		System.out.println(i.length);// gives size of array
		
		for(int j=0;j<i.length;j++) {
			
			System.out.println(i[j]);
			
			
		}
		
		double d[] = new double[3];
		d[0]= 10.33;
		d[1]= 12.33;
		d[2]= 13.33;
		
		char c[] = new char[3];
		c[0]='a';
		c[1]='3';
		c[2]='$';
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1]= false;
		
		String s[] = new String[3];
		s[0]="test";
		s[1]="hello";
		s[2]="world";
		
		System.out.println(s.length);
		
		//Object array is used to store different datatypes values
		
		Object ob[] = new Object[5];
		ob[0]= "tom";
		ob[1]= 23;
		ob[2]= 'M';
		ob[3]= "Bristol road";
		ob[4]= 100.55;
		
		System.out.println(ob[3]);
		System.out.println(ob.length);
		
		for(int k=0;k<ob.length;k++) {
			
			System.out.println(ob[k]);
		}
	}
	

}
