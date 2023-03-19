import java.util.Scanner;

public class maxValus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter a number : ");
        num = input.nextInt();

        if (num%2 ==0) {
            System.out.print("The number is EVEN");
        }

        else {
            System.out.print("The number is ODD");
        }

        System.out.println();


        int a,b,c,res;

        System.out.print("enter 3 numbers : ");

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a>b && a>c) {
            System.out.print("A is the greater ");
        } else if (b>a && b>c) {
            System.out.print("B is the greater");
        } else if (c>a && c>b){
            System.out.println(" c is greater ");
        }


    }
}
