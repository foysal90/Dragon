import java.util.Scanner;

public class marks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int marks = s.nextInt();

        if (marks >80 && marks <100) {
            System.out.print("A");
        }
        if (marks >60 && marks < 80){
            System.out.print("B");
        }
        if (marks >50 && marks < 60) {
            System.out.print("C");
        }

        if (marks>45 && marks<50) {
            System.out.print("D");
        }

        if (marks>25 && marks<45) {
            System.out.print("E");
        }

        else if (marks <25) {
            System.out.print("F");
        }

    }
}
