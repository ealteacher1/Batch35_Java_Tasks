package tasks_shaheena;

import java.util.ArrayList;
import java.util.Iterator;

     //2. Create another Class "S7_T8_2ArrayList_Object1" with Main method.
     //a.Create Three objects of "S7_T8_1AllWebsites" Class.  
     //i.For 1rst Object, Pass Web site Name as “Amazon” and Web site Link as “https://www.amazon.com”
     //ii.For 2nd Object, Pass Web site Name as “Walmart” and Web site Link as “https://www.walmart.com”
     //iii.For 3rd Object, Pass Web site Name as “Daraz” and Web site Link as “https: //daraz.com/”
      
     //b.create an Array list" All Web site Name And Links"
     //c. Store All the created Objects Inside the ArrayList.
     //d.Print All Index Value with the Help of Iterator.
     //Print all Index Values without Iterator

    public class S7_T8_2ArrayList_Object1 {
    	
    	

	public static void main(String[] args) {
		
		
		S7_T8_1AllWebsites  ob1 = new  S7_T8_1AllWebsites("Amazon", "https://www.amazon.com");
		S7_T8_1AllWebsites  ob2 = new  S7_T8_1AllWebsites("Walmart","https://www.walmart.com");
		S7_T8_1AllWebsites  ob3 = new  S7_T8_1AllWebsites("Daraz", "“https: //daraz.com/");
		
		//created Arraylist to insert object
		ArrayList<S7_T8_1AllWebsites> ar3=  new ArrayList<S7_T8_1AllWebsites>();
		
		ar3.add(ob1);
		ar3.add(ob2);
		ar3.add(ob3);
		
		//Iterate all the values inside iterator 
		
		Iterator <S7_T8_1AllWebsites> it= ar3.iterator();
		
		
		
		//prints with while loop 
		// Iterator having any open index (it.hasNext)
		//it.Next is returning object , having values web name & web link 
		while(it.hasNext()) {
			
		S7_T8_1AllWebsites abc= it.next();
		
		System.out.println(abc.WebsiteName);
		
		System.out.println(abc.WebsiteLink);
			
			


		}
		System.out.println("****** prints without iterator with for each loop ********");
		
		// prints without iterator with for each loop 
		for (S7_T8_1AllWebsites  xyz : ar3) {
			
		System.out.println(xyz.WebsiteName);
		
			 
	     System.out.println(xyz.WebsiteLink);
		}
		
	    }
	
        }


