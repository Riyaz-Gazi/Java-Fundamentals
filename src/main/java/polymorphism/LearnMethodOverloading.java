package polymorphism;

class Area{

    int sum(int a,int b){
        return a+b;
    }
    double sum(double a,double b){
        return a+b;
    }

    double sum(int a,int b,int c){
        return a+b+c;
    }

}

public class LearnMethodOverloading {
    public static void main(String[] args) {

        Area area = new Area();
        System.out.println(area.sum(1,2));
        System.out.println(area.sum(1,2,3));
        System.out.println(area.sum(1.2,2.5));

    }
}
