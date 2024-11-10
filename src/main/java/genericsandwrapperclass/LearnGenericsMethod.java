package genericsandwrapperclass;

public class LearnGenericsMethod {
    static <E> void printData(E data) {
        System.out.println(data);
    }

    <E extends Number> void doubleData(E data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        printData("12");
        printData(134);

        LearnGenericsMethod obj = new LearnGenericsMethod();
        obj.doubleData(23);

        CustomClass customClass = new CustomClass();
//        obj.doubleData(customClass);
    }
}


class CustomClass {

}
