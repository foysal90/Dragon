import java.util.Scanner;

public class swtchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String browser;

        System.out.print("Please Enter a Name : ");

        browser = input.next();

        System.out.print("welocme to " );

        switch (browser) {
            case "diffrent":
                System.out.println("Please select a diffrent number");
                break;
            case "chrome":
                System.out.print("Google Chrome");
                break;
            case "explorer":
                System.out.print("internet explorer ");
                break;
            case "mozilla":
                System.out.print("mozilla firefox");
                break;


            default:

                System.out.print("you have not selected any valid number");
        }

    }
}
