package java3_4;

public class Array_task_6 {

	public static void main(String[] args) {
		
		Object rimaobj[]=new Object[5];
		rimaobj[0]="one";
		rimaobj[1]=50;
		rimaobj[2]='c';
		rimaobj[3]=100;
		rimaobj[4]=200;
		System.out.println(rimaobj.length);
		for (int x=0; x<rimaobj.length;x++) {
			System.out.println(rimaobj[x]);
			
			for (Object Value:rimaobj) {
				System.out.println(Value);
				for (int a=rimaobj.length-1;a>=0;a--) {
					System.out.println("the value of index a="+rimaobj[a]);
					System.out.println("the value for index 2="+rimaobj[2]);
					System.out.println("the value for index 3="+rimaobj[3]);
					for (int b=4;b>=1;b--) {
						System.out.println("the value of index b ="+rimaobj[b]);
					}
				}
				
				
			}
			
			
		}
		
	}

}
