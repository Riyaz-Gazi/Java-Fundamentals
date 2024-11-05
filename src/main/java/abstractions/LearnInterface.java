package abstractions;

public class LearnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        System.out.println(Monkey.LEGS);
        monkey.walk();

    }
}

interface Animal{

    int LEGS = 4;
    void eats();
    void drinks();

    default void walk(){
        System.out.println("Animal is walking");
    }

}

interface Pet{


    void sings();
    void drinks();
}

class Monkey implements Animal,Pet{

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }

    @Override
    public void sings() {
        System.out.println("Pet is singing");
    }
}
