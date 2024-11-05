package inheritance;

public class Vehicle {
    final int gears = 4;
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
        System.out.println(v1.gears);
    }
    int wheelsCount;
    String model;

    Vehicle() {
        System.out.println("Creating a vehicle object");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }

    void start(){
        System.out.println("Vehicle is Staring");
    }

    final void accelerate(){
        System.out.println("vehicle is accelerating");
    }

}
