package streamandlambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        // older
//        Walkable obj = new WalkFast();
//        System.out.println(obj.walk(4));

//        Walkable obj2 = new Walkable() {
//            @Override
//            public int walk(int steps) {
//                return 0;
//            }
//        };

//        Walkable obj = (steps,isEnabled)->2*steps;
//
//        obj.walk(4,true);


        List<String> fruits = List.of("Apple", "Banana", "Kiwi");
        Stream<String> stream = fruits.stream();

//        stream.forEach((fruit)->{
//            System.out.println(fruit);
//        });

//        stream
//                .filter(fruit->fruit.length()<6)
//                .sorted()
//                .map(fruit->fruit.length())
//                .map(fruitLength->2*fruitLength)
//                .forEach(fruit -> System.out.println(fruit));
//    }

        List<Integer> fruitList = fruits
                .stream()
                .map(fruit -> fruit.length())
                .collect(Collectors.toList());
    }
}

interface Walkable {
    int walk(int steps, boolean isEnabled);
}

class WalkFast implements Walkable {

    @Override
    public int walk(int steps,boolean isEnabled) {
        return 2 * steps;
    }
}
