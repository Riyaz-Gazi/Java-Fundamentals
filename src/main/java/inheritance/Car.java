package inheritance;

public class Car extends Vehicle {
    String color;

    Car() {
        super(6);
        System.out.println("Car is created");
    }

    void start() {
        Scooter scooter = new Scooter();
        scooter.breaking(this);
        super.accelerate();
        System.out.println(this);
        System.out.println(this.model + " Car is starting");
    }

    Car braking(){
        return this;
    }


    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.wheelsCount);
        car.wheelsCount = 4;
        car.model = "I10";
        car.color = "Red";
        car.start();
        System.out.println(car.wheelsCount);
        car.braking();
        car.accelerate();
    }
}

class Scooter{

    void breaking(Car car){
        System.out.println(car.model + " is breaking");
    }
}