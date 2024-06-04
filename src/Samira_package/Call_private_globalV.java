package Samira_package;

public class Call_private_globalV {

	public static void main(String[] args) {
		Getter_setter ob1= new Getter_setter();
		ob1.setK(33);
		int global4=ob1.getK();
		System.out.println(global4);
		ob1.setS(22);
		int global5=ob1.getS();
		System.out.println(global5);

	}

}
