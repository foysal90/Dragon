import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        for (n = 1;  n<=10 ; n++) {
            System.out.println(n + ": " +2 + "*" +n+ "=" +(2*n));

        }

    }
}
