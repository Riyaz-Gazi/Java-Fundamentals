package classesandobject;

public class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name="Leo";
        d2.walk();

        Complex complex = new Complex();
        complex.a = 3;
        complex.b = 4;
        complex.print();
    }
}

class Dog{
    String name;
    int age;
    String color;
    void walk(){
        System.out.println(name + " is walking");
    }
    void bark(){
        System.out.println(name + " is barking");

    }
}

class Complex{
    int a,b;

    void print(){
        System.out.println(a+"+"+b+"i");
    }
}
class Cat{

}