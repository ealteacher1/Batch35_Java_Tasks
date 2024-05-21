package Shams_Demo;

public class ClassDD {

	public static void main(String[] args) {
	
		ClassDD ob1=new ClassDD();
		ClassDD ob2=new ClassDD(2,3);
		ClassDD ob3= new ClassDD("has","lam");
		ClassDD ob4= new ClassDD(1,2,2.2);
		
		
		ClassE ob22=new ClassE();
		ob22.callingfromE();
		
	}
	public ClassDD() {
    System.out.println("this is constractor 1:");
}
	public ClassDD(int k,int r) {
		System.out.println("this is constractor2:" +k +r);
			
		}
	public ClassDD(String l,String g) {
		System.out.println("this is constractor3:"+ l + g);
	}
	public ClassDD(int p,int j,double r) {
		System.out.println("this is constractor4:"+p +j+ r);
	}
		
}
