package Samira_package;

public class Getter_setter {
     
	
	private int s;
	private int k;
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public static void main(String[] args) {
		
		Getter_setter ob= new Getter_setter();
		ob.setK(2);
		int global=ob.getK();
		System.out.println(global);
		ob.setS(3);
		int global2=ob.getS();
		System.out.println(global2);
		
	}

}
