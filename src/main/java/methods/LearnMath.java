package methods;

public class LearnMath {
    public static void main(String[] args) {
        int a=7;
        int b=4;
        System.out.println(Math.min(a,b));
        System.out.println(Math.pow(2.4,5));
        System.out.println(Math.random());
        System.out.println(getRandom(10,20));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(5.9));
        System.out.println(Math.round(4.678));
    }

    public static int getRandom(int a,int b){
//        return (int)(Math.random()*6)+1;
        return (int)(Math.random()*(b-a+1)+a);
    }
}
