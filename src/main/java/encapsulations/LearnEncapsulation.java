package encapsulations;

import learnPackages.Person;

public class LearnEncapsulation {

    public static void printHello(){
        System.out.println("Hello");
    }
    {
        System.out.println("Normal Block");
    }

    static {
        System.out.println("Called from the static block");
    }

    static {
        System.out.println("Called from the static block second time");
    }

    public static void main(String[] args) {

        System.out.println("Main Execute");
        Person p1 = new Person();
        p1.setAge(12);

        System.out.println(p1.getAge()); // This is known as encapsulation and data hiding
        System.out.println(Person.count); // call static variable
        Person.count = 50;

        System.out.println(Person.count);

       printHello();

    }
}
