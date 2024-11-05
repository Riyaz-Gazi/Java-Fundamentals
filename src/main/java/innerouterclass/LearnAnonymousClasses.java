package innerouterclass;

public class LearnAnonymousClasses {

//    class InnerClass extends OuterClass{
//
//    }

    OuterClass obj = new OuterClass(){
        void sing(){

        }
        @Override
        public void outerMethod(){

        }
    };

    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod() {
            System.out.println("interface method");
        }
    };

    SuperInterface obj3 = ()->{
        System.out.println("interface method");

    };



    public static void main(String[] args) {
        Walkable walkable = (int steps)->{
            System.out.println("Walked steps "+steps);
            return steps;
        };
        walkable.walk(5);

        Walkable obj2 = (int steps)->2*steps;

        System.out.println(obj2.walk(2));

    }
}

class OuterClass{



    public void outerMethod(){

    }

}
@FunctionalInterface
interface SuperInterface{
    void interfaceMethod();
}

interface Walkable{
    int walk(int steps);
}
