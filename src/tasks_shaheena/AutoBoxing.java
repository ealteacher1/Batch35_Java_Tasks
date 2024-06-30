package tasks_shaheena;

    public class AutoBoxing{
	
	
	//1.Convert double 5.5 to a Double object;
	//2.Convert char '#' to a character Object;
	//3.Convert int 500 to a Integer Object;
	//4.Convert boolean false to a Boolean Object;


	 public static void main(String[] args){
		

      
      //using Wrapper class name(double),
       
       double d = 5.5;
     
       // Double ob = new Double(d);
      
       // object reference variable(ob),
       // Creating object & passing value directly to wrapper class
       
       Double ob = d;
	
       System.out.println(ob);
	 
	 
	 
       //convert Char into character object 
      char c = '#';
	  // Creating object & passing value directly to wrapper class
	  char ob1 =c;
	  
	  System.out.println(ob1);
	  
	  
	  
	  //convert Integer  into character object 
	  int i = 500;
	  
	  // Integer ob2 = new Integer(i);
	  
	  
	  // Creating object & passing value directly to wrapper class
	  int ob2 = i;
	
	  System.out.println(ob2);
	  
	 
	  //convert boolean   into character object 
	   boolean b = false;
	  
	  //Creating object & passing value directly to wrapper class
	   boolean ob3 = b;
	   
	   System.out.println(ob3);
	  
	 
	 }

      
    
      }
