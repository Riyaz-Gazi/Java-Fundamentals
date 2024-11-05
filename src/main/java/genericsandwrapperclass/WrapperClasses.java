package genericsandwrapperclass;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
    public static void main(String[] args) {

        Integer obj1 = Integer.valueOf("12");

        System.out.println(obj1*5);

        Integer obj2 = 12; // autoboxing

        int age = obj2; // unboxing

        Boolean myBoolean = Boolean.valueOf("true");

        List<Integer> list = new ArrayList<>();
    }
}
