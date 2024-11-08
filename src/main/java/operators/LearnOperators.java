package operators;

import java.util.Scanner;

public class LearnOperators {
    public static void main(String[] args) {
        // Arithmetic Operators
        // + , - , * , / , %

        // Assignment Operators
        // = , += , -= , *= , /= , %=

        // Relational Operators
        // == , != , > , < , >= , <=

        // Bitwise operators
        // ~ , << , >> , >>> , & , ^

        // others Operators
        // ++ , --
        // a++ means a = a+1 , a-- means a = a-1

        // Ternary Operators
        // ? :
        // a>b ? a:b

        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Age "+age);
        sc.close();
    }
}
