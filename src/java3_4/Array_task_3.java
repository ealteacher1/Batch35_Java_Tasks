package java3_4;

public class Array_task_3 {

	public static void main(String[] args) {
		String Rima[]=new String [5];
		Rima[0]="one";
		Rima[1]="two";
		Rima[2]="three";
		Rima[3]="four";
		Rima[4]="five";
		for (String value:Rima) {
			System.out.println(value);
			System.out.println("the value for index 2="+Rima[2]);
			System.out.println("the value for index 3="+Rima[3]);
			for(int i=0;i<Rima.length;i++) {
				System.out.println("the value of index"+i+":"+Rima[i]);
				
				for (int a=Rima.length-1;a>=0;a--) {
				System.out.println("the value of index a="+Rima[a]);
				
				for (int b=4;b>=1;b--) {
					System.out.println("the value of index b="+Rima[b]);
				}
				}
			}
		}
		
		
		

	}

}
