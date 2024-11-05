package exception;

public class FinallyBlockInException {
    public static void main(String[] args) {
        int[] a = new int[4];
        System.out.println("Hello world");

//        try{
//            System.out.println(a[2]);
//        }catch (Exception e){
//            System.out.println("Exception Handle");
//        }finally {
//            System.out.println("I will run always");
//        }

        try {
            getNumberFromArray(a);
        } catch (Exception e) {
            System.out.println("Exception Message " + e.getMessage());
        }

        System.out.println("Bye");
    }

    static int getNumberFromArray(int[] a) throws ArithmeticException {
        return a[8];
    }

}
