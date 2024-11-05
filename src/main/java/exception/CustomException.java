package exception;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");

        try {
            int age = sc.nextInt();
            if (age > 100) {
//                throw new MyException("My error is this");
                 throw new ArithmeticException("More than 100 is not allowed");
            }
        }catch (Exception e){
            System.out.println(e);
        }

//            int age = sc.nextInt();
//            if (age > 100) {
//                throw new MyException();
//            }

    }
}

class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}