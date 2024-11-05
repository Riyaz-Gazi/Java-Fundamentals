package conditionals;

public class LearnConditionals {
    public static void main(String[] args) {
        int a = 5;
        if(a==0){
            System.out.println("Value of a is zero");
        }else if(a>0){
            System.out.println("Value of a is positive");
        }else{
            System.out.println("Value of a is negative");
        }

        int a1=5,b1=6;
        int c=a1>b1?a1:b1;
        System.out.println(c);
    }
}
