package Shams_Demo;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
                               //Array.Task01.
		
		//01.find Array and print the values with each loop.
		int sam[]=new int [10];
		sam[0]=11;
		sam[1]=5;
		sam[2]=7;
		sam[3]=8;
		sam[4]=9;
		sam[5]=6;
		sam[6]=11;
		sam[7]=2;
		sam[8]=33;
		sam[9]=4;
		System.out.println(sam.length);
		for(int lam:sam) {
			System.out.println(lam);
		}
		//02.find the length of array and print out all the values from the first index to the last index with for loop.
		for(int lam:sam){
	    System.out.println(lam);
		}
        for(int value=0;value<=sam.length-1;value++) {
		System.out.println(sam[value]);
	
        }	
        //03.print out the value of index 5 and 7.
        System.out.println(sam[4]);
        System.out.println(sam[6]);
        //04.Find out the length of array and print out the values from last index to the first index(reverse order).
        System.out.println(sam.length);
        System.out.println(sam.length-1);
        System.out.println(sam[9]);
        for(int value=sam.length-1; value>0;value--) {
        System.out.println(sam[value]);
        }
        //05. find the length and printout all the values 5th index to eight index.
        for(int value=4; value<=7;value++) {
        System.out.println(sam[value]);
        }
        //06.find the length and print out all the values 8th to 4th index.
        for(int value=7;value>=3;value--) {
        System.out.println(sam[value]);
        }
        
                                    //Task02.Array
        
        String sys[]=new String[11];
        sys[0]="hello";
        sys[1]="my";
        sys[2]="name";
        sys[3]="name1";
        sys[4]="is";
        sys[5]="samira";
        sys[6]="I";
        sys[7]="have";
        sys[8]="bachelor";
        sys[9]="degree";
        sys[10]="good";
        //01.Find the length of the Array and print out all the values by using for each loop.
         System.out.println(sys.length);
         for(String box:sys) {
        	 System.out.println(box);
         }
        //02.print the value of index number 3 and 5 individually.
         System.out.println(sys[2]);
        System.out.println(sys[4]);
        //03.find the length of Array and print out the values of 1st index and last index.
        System.out.println(sys.length);
        for(int xx=0; xx<=sys.length-1; xx++) {
        	System.out.println(sys[xx]);
        	
        }
        //04.print values from last index to the first index by reverse.
        for(int xx=sys.length-1;xx>=0;xx--) {
        	System.out.println(sys[xx]);
        }
        //05.print all the values form 5th to 8th index.
        for(int xx=4; xx<=7;xx++) {
        	System.out.println(sys[xx]);
        }
        
                                       //Task03.Array
        
        String [] tv= {"I","have","a","nice","home"};
        //01.print all the values using for each loop.
        for(String box:tv) {
        	System.out.println(box);
        }
      //02.print the value of index 2 and index 3 individually.
        System.out.println(tv[1]);
        System.out.println(tv[2]);
       //03.print all the values from 1st index to last index using for loop.
        for(int box=0; box<=tv.length-1;box++) {
         System.out.println(tv[box]);
         }
        //04.print all the values from last index to the first index by reverse.
        for( int box=tv.length-1;box>=0;box--) {
        	System.out.println(tv[box]);
        }
        //05.print all the values from 5th index to 2nd index.
        for(int box=4;box>=1;box--) {
        	System.out.println(tv[box]);
        }
        
                                             //Tak04.Array.
        
         int ahmed[]= {1,2,8 ,9,6};
         
        //01.print all the values with for each loop.
         for( int key:ahmed) {
        	 System.out.println(key);
         }
        //02.find the length of Array and print values from 1st to last index with for loop.
         System.out.println(ahmed.length);
         for( int key=0;key<=ahmed.length-1;key++) {
        	 System.out.println(ahmed[key]);
         }
         //03.print all the values from last index to the first index by reverse.
         for(int key=ahmed.length-1;key>=0;key--) {
        	 System.out.println(ahmed[key]);
         }
         
         //04.print all the values from 5th to 2nd index.
         for(int key=4; key>=1;key--) {
        	 System.out.println(ahmed[key]);
         }
         
         
         
        
	}

}
