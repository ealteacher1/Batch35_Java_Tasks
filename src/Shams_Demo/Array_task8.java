package Shams_Demo;

public class Array_task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Object abc[][]= new Object [3][2];
      abc[0][1]=20;
      abc[2][1]=7;
      for (int row=0;row<abc.length;row++) {
    	  for(int column=0;column<abc[0].length;column++) {
    		  System.out.println(abc[row][column]);
    	  }
    	  {
      Object value=abc[0][1] ;
      System.out.println("values of 1st row and 2nd colunm = " +value);
      }
      }
      for (int row=0;row<abc.length;row++) {
          for(int column=0;column<abc[0].length;column++) {
        	System.out.println(abc[row][column]);
          }
 
	}

}}
