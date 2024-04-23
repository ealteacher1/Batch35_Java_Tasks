package israts_java_task;

public class Class_2_Task_4_Do_WhileLoop {

	public static void main(String[] args) {

// Task-4 -Do_while loop		
 // print 2 to -10

        int a = 2; 

          do {
              System.out.println(" vale of a ="+a);
              a--;
          }

          while (a>=-10); 




// print 3 to 20;
      int b = 3;
      do {
          System.out.println("vale of b : "+b);
          b++;
          }
      while(b<=20); 


// print -355 to -255
      int c = -355;
          do {
              System.out.println("vale of c : "+c);
              c++;
              }
          while(c<=-200);

// print -5 to 5 and break if the value is 3 
          int d = -5;
          do {
              System.out.println("vale of d : "+d);


          if (d==3) {
              System.out.println("Beautiful");
              break;
          }
          d++; }

          while(d<=5);

// print -500 to -200 and break if the value of the variable is -278
          int e =-500;
          do {
              System.out.println("vale of e : "+e);
              if (e==-278) {
                  System.out.println("Laugh");
                  break;
              }
              e++; 

          }
          while (e<=-200);
	}

}
