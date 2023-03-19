import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int months ;
        System.out.println("Enter a number : ");

        months = input.nextInt();

        if (months >= 1 && months <= 4 ) {
            System.out.print("you entered the " + months + " and it is winter");

        }
        else if (months >= 5 && months <= 8 ) {
            System.out.print("you entered the " + months + " and it is summer");
        }

        else if (months >= 9 && months <= 12 ) {
            System.out.print("you entered the " + months + " and it is spring");
        }

        else {
            System.out.print("invaid input");
        }


    }
}
