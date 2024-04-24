package suzy_java_task;

public class Class02_task1_do_while_loop {

    public static void main(String[] args) {
        // print 2 to -10

          int a = 2; // initialization

            do {
                System.out.println(" money ="+a);
                a--;
            }

            while (a>=-10); // condition




        // print 3 to 20;
        int b = 3;
        do {
            System.out.println("big money ="+b);
            b++;
            }
        while(b<=20); 


        // print -355 to -255
        int c = -355;
            do {
                System.out.println("happy life ="+c);
                c++;
                }
            while(c<=-200);

            // print -5 to 5 and break if the value is 3 
            int d = -5;
            do {
                System.out.println("good morning="+d);


            if (d==3) {
                System.out.println("hello world");
                break;
            }
            d++; }

            while(d<=5);

            // print -500 to -200 and break if the value of the variable is -278
            int e =-500;
            do {
                System.out.println("live your life "+e);
                if (e==-278) {
                    System.out.println("no way ");
                    break;
                }
                e++; 

            }
            while (e<=-200);
    }



}
