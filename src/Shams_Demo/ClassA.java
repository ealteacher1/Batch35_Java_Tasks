package Shams_Demo;

public class ClassA {

	public static void main(String[] args) {
		ClassA ob1=new ClassA();
		ob1.samira1();		
		ob1.sam1();
		ob1.sam2();
		ob1.samira2(3, 2);
		ob1.sam2();
		ob1.sam2(5, 5);
		ob1.samira3();
		ob1.sam33();
		ob1.sam();
		ob1.sam4(5, 3);
		ob1.sam5(2, 1);
	}
	// non static without argument (non return type)
	public void samira1() {
		int a=2;
		int b=2;
		System.out.println(a+b);
	}
	public void sam1() {
		int aa=3;
		int bb=4;
		System.out.println(aa+bb);
	}
	public void sam2() {
		String aaa="sam";
		String bbb="sam1";
		System.out.println(aaa+bbb);
	}

	//non static with argument (non return type)
	public void samira2(int t, int r) {
		System.out.println(t+r);
	}
	public void sam2(int tt,int rr) {
		System.out.println(tt+rr);
	}
	public void sam2(String sam1,String sam2) {
		System.out.println(sam1+sam2);
	}
	// non static without argument (return type )
	public int samira3() {
     int s=2;
     int q=3;
     int sos=s+q;
     return sos;
}
	public String sam33() {
		String ss="max";
		String qq="min";
		String sos1=ss+qq;
		return sos1;
	}
	public int sam() {
		int sss=2;
		int qqq=4;
		int sos2=sss+qqq;
		return sos2;
	}
	//non static with argument (return type)
	public String samira4(String salary,String tax) {
      		String profit="salary-tax";
      		return profit;
}
	public int sam4(int x,int y) {
		int num=x-y;
		return num;
	}
	public int sam5(int w,int h) {
		int sam5=w*h;
		return sam5;
	}

}


