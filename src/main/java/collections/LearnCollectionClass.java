package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(75);
        list.add(29);
        list.add(75);

        System.out.println("Min element : "+ Collections.min(list));
        System.out.println("Min element : "+ Collections.max(list));
        System.out.println("Frequency  : "+ Collections.frequency(list,75));

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);


        Student s1 = new Student(2,"Riyaz");
        Student s2 = new Student(3,"Rahul");
        Student s3 = new Student(67,"Mehak");
        Student s4 = new Student(22,"Priyanka");

        List<Student> students = List.of(s1,s2,s3,s4);
        System.out.println(students);
//        Collections.sort(students);

        System.out.println(s1.compareTo(s2));


    }

}
