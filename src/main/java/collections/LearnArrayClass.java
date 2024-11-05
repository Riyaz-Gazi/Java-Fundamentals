package collections;

import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers,4);

        System.out.println("The index of the element 4 in arrays : "+index);

        Arrays.sort(numbers);


        Arrays.fill(numbers,12);

        System.out.println(numbers);

        for(int i:numbers){
            System.out.println(i);
        }

    }
}
