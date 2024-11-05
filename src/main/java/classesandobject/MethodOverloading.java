package classesandobject;

public class MethodOverloading {
    public static void main(String[] args) {

        Greet greet = new Greet();
        greet.greetings();
        greet.greetings("Riaz");
        greet.greetings("Rahul", 3);

    }
}

class Greet {
    void greetings() {
        System.out.println("Hello , Good Morning");
    }

    void greetings(String name) {
        System.out.println("Hello " + name + ", Good Morning");
    }

    void greetings(String name, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("Hello " + name + ", Good Morning");
        }
    }
}