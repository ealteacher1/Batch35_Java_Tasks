package java3_4;

public class Array_task1 {

	public static void main(String[] args) {
		// Array task1
		int vegies[]=new int[10];
		vegies[0]=1;
		vegies[7]=14;
		vegies[9]=18;
		
		//print the Length of the array.
		System.out.println(vegies.length);
		for(int value:vegies) {
			System.out.println(value);
		}
		
		//printing out all the values.
		for (int x=0; x<vegies.length;x++) {
			System.out.println(vegies[x]);
		}
		System.out.println("Print the value for index 5="+vegies[5]);
		System.out.println("Print the value for index 7="+vegies[7]);
		System.out.println(vegies[5]);
		System.out.println(vegies[7]);
		
		//printing in reverse order.
		for (int x=vegies.length-1; x>0; x--) {
			System.out.println("the value of x="+x);
			for( int i=5; i<=8;i++) {
			System.out.println(" the value of index i="+i);
			
			 for (int a=8;a>4;a--) {
				 System.out.println("the value of index i="+i);
			 }
			
			
			}
		}
		
	}

}
