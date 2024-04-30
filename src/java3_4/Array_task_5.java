package java3_4;

public class Array_task_5 {

	public static void main(String[] args) {
		
		Object rimaobj[]=new Object[10];
		rimaobj[1]="one";
		rimaobj[5]=50;
		rimaobj[8]='c';
		System.out.println(rimaobj.length);
		for (int x=0; x<rimaobj.length;x++) {
			System.out.println(rimaobj[x]);
			System.out.println("the value for index 2="+rimaobj[2]);
			System.out.println("the value for index 3="+rimaobj[3]);
			for (int a=rimaobj.length-1;a>=0;a--) {
				System.out.println("the value of index a="+rimaobj[a]);
				for( int i=5; i<=8;i++) {
					System.out.println(" the value of index i="+rimaobj[i]);
					 for (int b=8;b>=4;b--) {
						 System.out.println("the value of index b="+ rimaobj[b]);
					 }
				}
			}
		}
	}

}
