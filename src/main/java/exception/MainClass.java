package exception;

public class MainClass {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println(a[0]);

        try {
            int res = 5 / 0;
            System.out.println(a[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access the out of bound element");
        } catch (ArithmeticException e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(e);
        }

//        try {
//            int res = 5 / 0;
//            System.out.println(a[5]);
//
//        } catch (Exception e){
//            System.out.println("All Exception Handled");
//        }
//        catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//            System.out.println("Handling the exception");
//        } catch (RuntimeException e) {
//        }

        System.out.println("Hello guys");
    }
}
