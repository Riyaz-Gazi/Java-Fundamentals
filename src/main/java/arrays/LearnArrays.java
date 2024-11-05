package arrays;

import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
        int[] age; // declaration
        age = new int[5]; // allocation

        // Part-1
        age[0] = 1;
        age[1] = 2;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);

        System.out.println(age.length);
        System.out.println(Arrays.stream(age).max().getAsInt());

        // Part-2
        int[] marks = {67, 68, 69, 60};
        System.out.println(marks);

        // Part-3
        String[] names = {"iyer", "siraj", "virat"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Part-4
        for (String name : names) {
            System.out.println("for each " + name);
        }

        // Part-5
        int[][] value = {
                {1, 2, 3, 4},
                {2, 4, 5, 6}
        };
    }
}
