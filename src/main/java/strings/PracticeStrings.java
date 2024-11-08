package strings;

import java.util.Scanner;

public class PracticeStrings {
    public static void main(String[] args) {
        /***
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your first name :");
         String first = sc.nextLine();
         System.out.println("Enter your last name :");
         String last = sc.nextLine();

         System.out.println("Full name is " + first + " " + last);
         sc.close();
         ***/

        // String methods

        String name = "  aNuj23   ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.startsWith("  aN"));
        System.out.println(name.endsWith("3   "));
        System.out.println(name.charAt(3));

        int age = 123;
        String stringAge = String.valueOf(age);
        System.out.println(stringAge);

        String sentence = "I love Java, Java is good language";
        String newSentence = sentence.replace("Java","Python");
        System.out.println(sentence);
        System.out.println(newSentence);
        System.out.println(sentence.contains("Java"));
        System.out.println(sentence.substring(2,11));

        String[] words = sentence.split(" ");
        for(String word:words){
            System.out.println(word);
        }

        String color = "Brown";
        char[] letters = color.toCharArray();
        String revertColor = new String(letters);
        System.out.println(color.isEmpty());

        // reverse a string
        String reverse = "riyaz";
        StringBuilder stringBuilder = new StringBuilder(reverse).reverse();
        String reverseString = stringBuilder.toString();
        System.out.println(reverseString);
        System.out.println(reverse.indexOf("i"));
        System.out.println(reverse.indexOf("b"));

    }
}
