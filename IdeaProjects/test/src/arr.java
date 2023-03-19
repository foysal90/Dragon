import java.util.Arrays;

public class arr {

    public static void main(String[] args) {
        int [] number = {5,3,2,6,10,4,-5};

        Arrays.sort(number);

        for (int i = 0; i <=number.length ; i++) {
            System.out.println(number[i]);

        };

        String[] names = {"foysal", "ahmed", "masum"};

        Arrays.sort(names);

        for (int i = 0; i <=names.length; i++) {
            System.out.println(names [i]);

        };
    }
}
