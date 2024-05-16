package methode;

public class Task3method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		// first part of task 3
		Task3method ob =new Task3method();
		
		int x= ob.addition();
		int y= ob.Subtraction();
		String z = ob.tablename();
		int w= ob.comparetwonumber();
		double e= ob.Multiplicationofnumber();
		
        System.out.println("Sum of addition" );
		System.out.println("result of subtraction");
		System.out.println("z");
		System.out.println("comparision of two numbers ");
		System.out.println("multiplication of number");
	}
		
	 //this  datatype  method is  returning int data type
		//so we have to sore it in int datatype box;
		
		public int addition() {
			int a= 10;
			int b= 5;
			int sum=a+b;
			return sum;
		}
		public int Subtraction() {
			int f=100;
			int g=50;
			int result=f-g;
			return result;
		}
		public String tablename() {
			String a="grade";
			String b= "score";
			return a+b;
		}
		public double Multiplicationofnumber() {
			double v=10;
			double o=10;
			double multiplenumber=o*v;
			return multiplenumber;
		}
	   public int comparetwonumber () {
		   int j=49;
		   int i=56;
		   if (j>i)
		   
		   return j;
		   
        else 
		   
		   return i;
	   }
	   
	   
	   
	   
	   
	 
	   //second part of task 3;
		   // one dim array, for eah loop;
		   public static int[]  CMKGL() {
			 int  onedimintarray[]= {23,20,2};
			 return onedimintarray ;
			 
		   }
		   // object one dim array;
		   
		   public static Object [] XWQ () {
			   Object onedimarray[]= {"one","two","three"};
			   return onedimarray ;
		   }
		   
		   // two dim array ; for each loop;
		   
		   public static String [][] carmake () {
			   String TwoDimArray [][] ={{"toyota","chevrollet"},{"subaru","honda"}} ;
			   return TwoDimArray;
		   }
		   
		   
		   
		   public static Object [][] truckcompany() {
			   Object twodimmarray[][] = {{ "southwest","swift"},{"knight","Yellow"}};
			   return twodimmarray;
		   }}
		   
			   
		      

			   

		   
		
		
	


