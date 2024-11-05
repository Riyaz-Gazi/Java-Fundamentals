package loops;

import java.util.Scanner;

public class LearnLoops {
    public static void main(String[] args) {

        // Part-1
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
        }

        // Part-2
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value :");
//        int n = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Value of " + i + " is : " + i * n);
//        }

        // Part -3
//        boolean hasLearn=false;
//        while (!hasLearn){
//            System.out.println("Are you learn completely");
//            hasLearn=sc.nextBoolean();
//        }f


        // Part - 4
        int k = 0;
        while (k < 2) {
            System.out.println("value is  " + k);
            k++;
        }

        // Part - 5
        do {
            System.out.println("Riyaz");
        } while (k < 1);

    }
}
