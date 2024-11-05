package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        // Iterator - 1
        for(int i=0;i<fruits.size();i++){
            System.out.println("fruit is "+fruits.get(i));
        }

        // Iterator - 2
        for(String fruit:fruits){
            System.out.println("for each fruit "+fruit);
        }

        // Iterator - 3
        Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()){
            System.out.println("Iterator "+fruitIterator.next());
        }

        // sublist
        System.out.println(fruits.subList(0,1));

    }
}
