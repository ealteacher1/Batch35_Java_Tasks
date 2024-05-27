package Shams_Demo;

public class call_by_reference_variable {

	public static void main(String[] args) {
		call_by_reference_variable ob= new call_by_reference_variable();
		ob.method1(ob);
		ob.method1(new call_by_reference_variable());
	    ob.method2(ob);
	    ob.method2(new call_by_reference_variable());
	   ob.method3(100);
	   ob.method4("String money");
	   ob.method5(100);
	 
	   
	int x=100;
	String e="sam";
	System.out.println(100);
	System.out.println(e);	
    int w=12;
         w=x;
         
         
	}
	public void method1(call_by_reference_variable tax) {
		System.out.println("method1");
		
	}
	public void method2(call_by_reference_variable salary) {
		System.out.println("method2");
	}
	protected void method3(int benefite) {
		System.out.println("method3");
		
	}
	public void method4(String money) {
		System.out.println("money");
	}
	public void method5(int life) {
		System.out.println("life");
		
	}
	//Task02-methods overload
	public void samiramedjabra() {
	System.out.println(1);
}
	public void samiramedjabra(int x) {
     System.out.println("the value is:"+x);
}
	public void samiramedjabra(int x, int y) {
    System.out.println(3);
}
	public void samiramedjabra(int x, int y, int q) {
	System.out.println(4);
	}
	public void samiramedjabra(int x, int y, int q, int w) {
	System.out.println(5);
	}
	public void samiramedjabra(int x, int y, int q, int w, int r) {
	System.out.println(6);	
	}
	public void samiramedjabra(int x, int y, int q, int w, int r, int t) {
	System.out.println(7);	
}
	public void samiramedjabra(int x, int y, int q, int w, int r, int t, int u) {
	System.out.println(8);	
	}
	public void samiramedjabra(int x, int y, int q, int w, int r, int t, int u, int o) {
	System.out.println(9);	
	}
	public void samiramedjabra(int x, int y, int q, int w, int r, int t, int u,int o,int f) {
	System.out.println(10);	
	}	
		
		//Class overload
	public call_by_reference_variable() {
		System.out.println("const1");
	}	
	public call_by_reference_variable(int x) {	
	System.out.println("const2");	
	}	
	public call_by_reference_variable(int x, int y) {	
	System.out.println("constr3");	
	}	
	public call_by_reference_variable(int x, int y, int q) {
	System.out.println("constr4");
    }
	public call_by_reference_variable(int x, int y, int q, int w) {
	System.out.println("constr5");
	}
	public call_by_reference_variable(int x, int y, int q, int w, int t) {
		System.out.println("constr6");
	}
	public call_by_reference_variable(int x, int y, int q, int w, int t, int r) {
		System.out.println("constr7");
	}
	public call_by_reference_variable(int x, int y, int q, int w, int t, int r, int p) {
	System.out.println("const8");
	}
	public call_by_reference_variable(int x, int y, int q, int w, int t, int r, int p, int f ) {
	System.out.println("constr9");
	}
	public call_by_reference_variable(int x, int y, int q, int w, int t, int r, int p, int f, int h) {
	System.out.println("constr10");
	
	}
}
