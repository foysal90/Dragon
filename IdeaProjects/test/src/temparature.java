import java.util.Scanner;

public class temparature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double cels,farn;

        System.out.print("current celsius is :");
        cels = input.nextDouble();

        farn = 1.8 * cels +32;

        System.out.print("local temperature is in fahrenheit :" + farn);

        System.out.println();



        double farn1, cels1;

        System.out.print("Enter fahrenheit : ");

        farn1 = input.nextDouble();

        cels1 = 1.8 / farn1 - 32;

        System.out.print("Local temperature is in celsius : " + cels);
    }
}
