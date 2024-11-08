package methods;

public class LearnMethods {
    public static void main(String[] args) {
      System.out.println(args[0]);
        for(String arg:args){
            System.out.println(arg);
        }
        greet();
        System.out.println(average(3,8));

        System.out.println(minimum(3,4));
    }

    public static void greet() {
        System.out.println("Hello World!!!");

    }

    public static double average(int a, int b) {
        return (double)(a + b) / 2;
    }

    static int minimum(int a,int b){
        return a<b?a:b;
    }
}
