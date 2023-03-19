import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class math {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x,y,result1, resul2, absolute,round;

        double power,pi,a,b;

        System.out.print("Enter 2 numbers : ");

         x = input.nextInt();
         y = input.nextInt();

        result1 = Math.max(x, y);

        resul2 = Math.min(x, y);

        absolute = Math.abs(x);

        round = Math.round(9.5f);
        a = 3.14;
        b = 3.24;

        b = Math.floor(b);
        a = Math.ceil(a);


        power = Math.pow(x,y);

        pi = Math.PI;



        System.out.print("The max value you entered  is : " + result1);

        System.out.println();

        System.out.print("The min value you entered  is : " + resul2);
        System.out.println();

        System.out.println("ROUND OF 9.5 = " +round);
        System.out.println();

        System.out.println("ceil of a is : "+a);
        System.out.println();

        System.out.println("floor of b is : "+b);
        System.out.println();


        System.out.print("The absolute value of X you entered  is : " + absolute);

        System.out.println();

        System.out.print("pi = " + pi);

        System.out.println();

        System.out.print("x to the power y : " +power);




    }
}
