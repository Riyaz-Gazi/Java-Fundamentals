package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LearnIOException {
    public static void main(String[] args) throws IOException {
        File file  = new File("text.txt");
        FileInputStream stream = new FileInputStream(file);
    }
}

class Main{
    public static void divideByZero(){
        throw new ArithmeticException("Cannot divide by zero");
    }
}
