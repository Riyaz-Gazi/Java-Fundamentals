package java8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearnPredicate {
    public static void main(String[] args) {
        // Part-1
        Predicate<Integer> predicate = x -> x > 10;
        System.out.println(predicate.test(12));

        // Part-2
        Predicate<Integer> evenInteger = x -> x % 2 == 0;
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        int sum1 = numbers.stream().filter(evenInteger).mapToInt(n -> n).sum();
        List<Integer> squareNumberList = numbers.stream().map(x->x*x).collect(Collectors.toList());
        Set<Integer> squareNumberSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        Map<Integer,Integer> squareNumberMap = numbers.stream().map(x->x*x).collect(Collectors.toMap(x->x,x->x*x));
        System.out.println(squareNumberList);
        System.out.println(squareNumberSet);
        System.out.println(squareNumberMap);
        System.out.println(sum);
        System.out.println(sum1);

        // Part-3 Intersection of two predicate
        Predicate<String> startWithR = x -> x.charAt(0) == 'r';
        Predicate<String> endWithZ = x -> x.charAt(x.length() - 1) == 'z';
        Predicate<String> and = startWithR.and(endWithZ);
        Predicate<String> or = startWithR.or(endWithZ);
        Predicate<String> negate = startWithR.negate();
        Predicate<Object> objectsPredicate = Predicate.isEqual("Riyaz");

        System.out.println(and.test("riyazt"));
        System.out.println(or.test("riyazt"));
        System.out.println(negate.test("riyaz"));
        System.out.println(objectsPredicate.test("Riyaz"));
    }
}
