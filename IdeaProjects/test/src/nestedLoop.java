import java.util.Scanner;

public class nestedLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m,n;
        System.out.println("Enter initial Number : ");

        m = input.nextInt();

        System.out.println("Enter final number : ");

        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            for (int j = m; j < n; j++) {



                System.out.println(i + " X " + j + " = " + i * j);

            }

            System.out.println("\n\n");

        }

        }






        }


