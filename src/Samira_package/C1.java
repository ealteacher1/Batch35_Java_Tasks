package Samira_package;

public class C1 extends C2 {

	public static void main(String[] args) {
		C1 a=(C1)new C2();
        C2 s= (C2)new C1();
        s.sam();
	}
public void sam() {
	System.out.println("sam");
}
}
