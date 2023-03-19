
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner inout = new Scanner(System.in);
        System.out.print("Please enter 5 numbers to see the output  :" );

        int m = inout.nextInt();
        int n = inout.nextInt();
        int a = inout.nextInt();
        int d = inout.nextInt();
        int f = inout.nextInt();
        int total = m + n + a + d + f;

        System.out.println("total value: " + total );
        System.out.println();

        int ave = total / 5;

        if (ave >=90 && ave <100) {
            System.out.print("E");
        }
        if (ave >=80 && ave <00) {
            System.out.print("outstanding");
        }
        if (ave >=70 && ave <80) {
            System.out.print("A");
        }
        if (ave >=60 && ave < 70){
            System.out.print("B");
        }
        if (ave>=50 && ave < 60) {
            System.out.print("C");
        }

        if (ave<50) {
            System.out.print("D ");
        }



        else {
            System.out.print("F");
        }
        System.out.println();


        System.out.print ("average value: " + ave);

    }
}
