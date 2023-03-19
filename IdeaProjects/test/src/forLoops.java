public class forLoops {

    public static void main(String[] args) {
        int num = 5;
        while (num>=0){
            System.out.println(num);

            num--;
        }

        System.out.println("the loop is out of expected value " + num + "has exceed the loop");

//        do while loop

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while(i<=5);


//        for loop

//        for (int n = 0; n<=30; n++){
//            if (n%2!=0){
//                System.out.println(n);
//            }
//        }
//
        for (int odd=1; odd<=30; odd+=2){
            System.out.println(odd);
        }


    }
}
