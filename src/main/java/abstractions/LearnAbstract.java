package abstractions;

public class LearnAbstract {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.accelerate();
        c1.breaks(3);
        c1.honks();
    }
}

abstract class Vehicle{
    abstract void accelerate();
    abstract int breaks(int wheels);
    void honks(){
        System.out.println("Vehicle honks");
    }

}

class Car extends Vehicle{

    @Override
    void accelerate() {
        System.out.println("Car is Accelerating");
    }
    @Override
    int breaks(int wheels) {
        System.out.println("Car breaks are pushed");
        return wheels;
    }

//    @Override
    void honks(){
        System.out.println("Car is honks");
    }
}

abstract class Human{
    void speak(){
        System.out.println("Human can speak");
    }
    abstract void eat();
}