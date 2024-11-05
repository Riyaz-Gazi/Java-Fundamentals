package java8;

interface Employee {
    String getName();
}

class SoftwareEngineer implements Employee {
    @Override
    public String getName() {
        return "Software Engineer!!!";
    }
}

public class LearnLambda {
    private void hello() {
        System.out.println("Hello!!!");

    }

    public static void main(String[] args) {
        // Part - 1
        Child child = new Child();
        child.sayBye();
        MyInterface.sayOk();
        child.sayHello();

        // Part-2 How to use functional interface
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        System.out.println(softwareEngineer.getName());

        Employee employee = () -> "Software developer";
        System.out.println(employee.getName());
    }
}

@FunctionalInterface
interface MyInterface {
    void sayHello();

    default void sayBye() {
        System.out.println("Bye");
    }

    ;

    static void sayOk() {
        System.out.println("OK");
    }

    ;
}

class Child implements MyInterface {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}