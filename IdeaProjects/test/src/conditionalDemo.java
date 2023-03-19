import java.util.Arrays;
import java.util.Scanner;

public class conditionalDemo {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//       ternary operator

        Scanner input = new Scanner(System.in);


         int num1, num2, large;

        System.out.print("Enter 2 numbers : ");

        num1 = input.nextInt();
        num2 = input.nextInt();

        large = (num1>num2) ? num1 : num2;

        System.out.print("you have selected " + large);

        System.out.println();



        int digit;

        System.out.print(" enter a digit ");

        digit = input.nextInt();

        switch (digit){

            case 0:
                System.out.print("please select a different number");
                break;

            case 1:
                System.out.print("you have selected english");
                break;
            case 2:
                System.out.print("you have selected bengali");
                break;
            case 3:
                System.out.print("you have selected to have an interpreter ");
                break;

            default:

                System.out.print("you have not selected any valid number");




        }







    }
}
