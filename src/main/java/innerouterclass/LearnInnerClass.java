package innerouterclass;

public class LearnInnerClass {
     class Toy{
        int price;
    }

    static class PlayStation{
         int price;
    }

    public static void main(String[] args) {

        Toy toy = new LearnInnerClass().new Toy();
        toy.price = 12;

        PlayStation playStation = new LearnInnerClass.PlayStation();
    }
}
