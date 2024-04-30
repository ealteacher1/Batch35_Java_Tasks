package java3_4;

public class Array_task_4 {

	public static void main(String[] args) {
		int Rima[]=new int[5];
		Rima[0]=1;
		Rima[1]=2;
		Rima[2]=3;
		Rima[3]=4;
		Rima[4]=5;
		System.out.println(Rima.length);
		for (int value:Rima) {
			System.out.println(value);
			for (int a=Rima.length-1;a>=0;a--) {
			System.out.println("the value of index a ="+Rima[a]);
			for (int b=4;b>=1;b--) {
				System.out.println("the value of index b ="+Rima[b]);
			}
			}
			
			
		}
	}
}

