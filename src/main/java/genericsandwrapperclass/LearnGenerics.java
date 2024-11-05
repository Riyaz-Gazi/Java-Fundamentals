package genericsandwrapperclass;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String,Integer> d1 = new Dog<>("12",3);
        Dog<Integer,String> d2 = new Dog<>(2,"Riyaz");
        System.out.println(d1.getId());

    }
}
class Dog<E,V>{
    E id;

    V name;

    public Dog(E id,V name){
        this.id=id;
        this.name = name;
    }

    E getId(){
        return id;
    }
}
