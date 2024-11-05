package collections;

import java.util.*;

class Student implements Comparable<Student>{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {

        return this.rollNo-that.rollNo;
    }
}

public class LearnSets {
    enum Color{
        RED,YELLOW,GREEN
    }
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>(); - // O(1)
//        Set<Integer> set = new LinkedHashSet<>(); // O(n)
//        Set<Integer> set = new TreeSet<>(); // O(log(n))
//
//        set.add(10);
//        set.add(50);
//        set.add(40);
//        set.add(20);

//        set.remove(10);
//        System.out.println(set);


//        Set<Student> set = new HashSet<>();
//        set.add(new Student(1,"anuj"));
//        set.add(new Student(2,"riyaz"));
//        set.add(new Student(1,"rahul"));
//
//        System.out.println(set);
        System.out.println(Color.GREEN);
//        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);

    }
}
