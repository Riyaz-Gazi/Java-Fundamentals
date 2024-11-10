# Classes & Objects

In Java, classes and objects are central concepts in Object-Oriented Programming (OOP). Here’s an overview with examples
to help you understand them.

## 1. Classes

A class is a blueprint for creating objects. It defines properties (fields/attributes) and behaviors (methods) that the
objects will have.

### Code Example

```java
class Car {
    // Fields
    String color;
    String model;
    int year;

    // Method
    void displayCarInfo() {
        System.out.println("Car model: " + model + ", Color: " + color + ", Year: " + year);
    }
}

```

## 2. Objects

An object is an instance of a class. When you create an object, you're creating a specific instance of a class with
actual values.

### Code Example

```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of Car
        Car myCar = new Car();

        // Setting attributes
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.year = 2020;

        // Calling method
        myCar.displayCarInfo();
    }
}

```

## 3. Constructors

A constructor is a special method used to initialize objects. It’s called when an object is created and often sets
initial values for fields.

- Default Constructor
- Parameterized Constructor

### Code Example

```java
class Car {
    String model;
    String color;

    // Constructor
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void displayCarInfo() {
        System.out.println("Model: " + model + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Blue");
        myCar.displayCarInfo();
    }
}

```

## 4. Constructors Overloading

Constructor overloading in Java refers to the ability to define multiple constructors within the same class, each with a
different set of parameters. This allows an object to be initialized in different ways depending on the arguments passed
during object creation.

## Code Example

```java
class Car {
    String model;
    String color;
    int year;

    // Constructor with no arguments
    public Car() {
        model = "Unknown";
        color = "Unknown";
        year = 0;
    }

    // Constructor with one argument
    public Car(String model) {
        this.model = model;
        this.color = "Unknown";
        this.year = 0;
    }

    // Constructor with two arguments
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.year = 0;
    }

    // Constructor with three arguments
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to display car information
    public void displayCarInfo() {
        System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the constructor with no arguments
        Car car1 = new Car();
        car1.displayCarInfo();

        // Using the constructor with one argument
        Car car2 = new Car("Toyota");
        car2.displayCarInfo();

        // Using the constructor with two arguments
        Car car3 = new Car("Honda", "Red");
        car3.displayCarInfo();

        // Using the constructor with three arguments
        Car car4 = new Car("BMW", "Black", 2020);
        car4.displayCarInfo();
    }
}

```

## 5. Method Overloading

Method overloading is the concept of defining multiple methods with the same name in a class, but with different
parameter lists (either a different number of parameters or different types of parameters). This allows you to perform
similar operations with different types or numbers of inputs.

## Code Example

```java
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values (overloaded)
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add two strings (concatenate them, overloaded)
    public String add(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the method with two integer parameters
        System.out.println("Sum of two integers: " + calc.add(10, 20));

        // Calling the method with three integer parameters
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));

        // Calling the method with two double parameters
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));

        // Calling the method with two string parameters (concatenate)
        System.out.println("Concatenation of two strings: " + calc.add("Hello, ", "World!"));
    }
}

```

# Inheritance

Inheritance is one of the core principles of object-oriented programming (OOP). It allows a new class (subclass or child
class) to inherit properties and behaviors (fields and methods) from an existing class (superclass or parent class).
Inheritance promotes code reuse, improves maintainability, and allows for a hierarchical relationship between classes.

### Type of Inheritance

- Single Inheritance : A class inherits from one superclass.
- Multilevel Inheritance : A class inherits from another class, which itself is a subclass of another class.
- Multiple Inheritance : Multiple subclasses inherit from a single superclass.
- Hierarchical Inheritance :  In Java, multiple inheritance is supported through interfaces (a class cannot directly
  inherit from multiple classes, but it can implement multiple interfaces).

### Code Example

```java
// Superclass (Parent Class)
class Animal {
    String name;

    // Method in superclass
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method in superclass
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass (Child Class) inheriting from Animal
class Dog extends Animal {
    // Method specific to Dog class
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Dog class
        Dog dog = new Dog();
        dog.name = "Buddy";  // Inherited field from Animal class

        // Calling methods inherited from Animal class
        dog.eat();
        dog.sleep();

        // Calling method specific to Dog class
        dog.bark();
    }
}

```

# Keyword : this , super , final

## this

this keyword in Java is a reference variable that refers to the current object, i.e., the object that is calling the
method or constructor. It is primarily used to distinguish between instance variables (fields) and local variables (
parameters) when they have the same name, and to refer to the current object within the class.

## super

super keyword in Java is used to refer to the parent (super) class of the current object. It allows access to the super
class's methods, fields, and constructors. The super keyword can be used in several contexts, including calling a
superclass constructor, accessing superclass methods, and referencing superclass fields.

## final

In java , the final keyword is a non access modifier that is used to define entities that cannot be changed or modified

### final variable

variable with final keyword cannot be assigned again

### final method

method with final keyword cannot be overridden by its subclass

### final class

class with final keyword cannot be extended or inherited from other class

# Polymorphism

Polymorphism is one of the core concepts of object-oriented programming (OOP). The term polymorphism comes from the
Greek words "poly" (many) and "morph" (form). So, polymorphism means many forms. In Java, polymorphism allows objects of
different classes to be treated as objects of a common superclass. It enables a single interface to represent different
types of objects, thereby allowing methods to behave differently based on the object they are operating on.

## Types of Polymorphism in Java:

- Compile-time Polymorphism (Static Binding): Achieved by method overloading and constructor overloading.
- Runtime Polymorphism (Dynamic Binding): Achieved by method overriding.

## Compile-time Polymorphism (Method Overloading)

Method overloading is when multiple methods have the same name but differ in their parameter types, number of
parameters, or both. The method that gets called is determined at compile-time based on the method signature.

### Code Example

```java 
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values (overloaded)
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add two strings (concatenate them, overloaded)
    public String add(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the method with two integer parameters
        System.out.println("Sum of two integers: " + calc.add(10, 20));

        // Calling the method with three integer parameters
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));

        // Calling the method with two double parameters
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));

        // Calling the method with two string parameters (concatenate)
        System.out.println("Concatenation of two strings: " + calc.add("Hello, ", "World!"));
    }
}

```

## Runtime Polymorphism (Method Overriding)

Method overriding is when a subclass provides a specific implementation of a method that is already defined in its
superclass. The method in the subclass has the same name, same parameter list, and same return type as the method in the
superclass.

The method that gets called is determined at runtime, based on the actual object (not the reference type) being used.

### Code Example

```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        Animal myDog = new Dog(); // Create a Dog object
        Animal myCat = new Cat(); // Create a Cat object

        myAnimal.sound(); // Calls Animal's sound method
        myDog.sound(); // Calls Dog's sound method (runtime polymorphism)
        myCat.sound(); // Calls Cat's sound method (runtime polymorphism)
    }
}

```

# Encapsulation

## Access Modifiers in Java

In Java, access modifiers are keywords used to specify the visibility or accessibility of classes, methods, variables,
and constructors. They control the scope of access to members of a class and help in implementing encapsulation and data
hiding. There are four types of access modifiers in Java:

- public
- protected
- default
- private

### public

- The public access modifier makes a class, method, or variable accessible from anywhere in the program, including other
  packages.
- If a class is declared as public, it can be accessed by any other class in any package.

### protected

- The protected access modifier allows access to the same package or subclasses (even if they are in different
  packages).
- It is less restrictive than private but more restrictive than public.

### default

- When no access modifier is specified, it is considered default (package-private).
- The members are accessible only within the same package.
- It is the most restrictive modifier for accessing members of a class, as it does not allow access from outside the
  package, even by subclasses.

### private

- The private access modifier makes a field, method, or constructor accessible only within the same class.
- No other class (including subclasses) can access private members, making it the most restrictive access modifier.

## Encapsulation

- Encapsulation refers to the bundling the data (attributes or fields) and the methods (functions or behaviors) that
  operate on the data into a single unit called a class.
- Encapsulation helps to protect the data from unintended access or modification, promoting data security and modularity
  in your code.
- Data Hiding: By restricting direct access to fields (using the private modifier), encapsulation prevents outside
  classes from modifying the fields directly. Access to data is managed through methods.
- Increased Flexibility: Encapsulation allows you to control how fields are accessed and modified. For instance, you can
  add validation in setter methods.
- Modularity: Since the data and methods are bundled together, it makes the code modular, making it easier to debug and
  modify.
- Improved Maintenance and Testing: Code with encapsulation is easier to maintain and test. You can modify the internal
  implementation without affecting other parts of the codebase.

### Code Example

```java
class Employee {
    // Private fields
    private String name;
    private int age;
    private double salary;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public setter for salary with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Display employee information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values using setters
        emp.setName("Alice");
        emp.setAge(30);
        emp.setSalary(50000);

        // Getting values using getters
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());

        emp.displayInfo();
    }
}

```

- Fields name, age, and salary are private, meaning they cannot be accessed directly outside the Employee class.
- Public getter and setter methods provide controlled access to these fields, allowing validation and manipulation
  before setting values.

### Why Use Encapsulation?

#### Control Over Data:

With encapsulation, you can apply validation in setters, which restricts invalid values from being assigned to fields.

#### Ease of Maintenance:

By encapsulating the implementation details, you can modify or improve the internal logic without impacting code that
uses the class.

#### Better Security:

Since fields are private, they cannot be accessed or modified from outside the class, adding a layer of security to
sensitive data.

#### Simplifies the Codebase:

Encapsulation enables modular design, which is easier to read, understand, and test.

## Static keyword

If we want to access class members without creating an instance of the class , we need to declare the class member
static.

- static variables can be accessed by calling the class name of the class .
- There is no need to create an instance of the class for accessing the static variable.
- static variable
- static methods
- static block

### Why static Members Don’t Require an Object

#### Class-level Association:

- When you declare a variable or method as static, it is associated with the class itself rather than any specific
  object.
- Since static members belong to the class and not to individual objects, they are shared across all instances of that
  class.

#### Memory Management:

- A static variable is stored in a special memory area allocated for the class, called the class area or method area,
  which is loaded when the class is loaded by the JVM.
- Since the static member is already associated with the class in memory, there’s no need to create an object to access
  it.

#### Direct Access Through Class Name:

- Static members can be accessed directly using the class name, rather than an object reference.

### Key Points About Static Members:

#### Single Copy:

- Only one copy of a static variable exists, shared among all instances of the class.

#### Memory Efficiency:

- Since static members are created only once and shared, they help save memory.

# Abstraction

- Abstraction is one of the fundamental principles of object-oriented programming (OOP) in Java.
- It allows a programmer to focus on essential details by hiding unnecessary implementation.
- In simple terms, abstraction helps in defining what an object does, rather than how it does it.
- By abstracting out details, we make our code easier to use, understand, and modify.

In Java, abstraction can be achieved through:

- Abstract Classes
- Interfaces

## Why Use Abstraction?

#### Simplifies Code Usage:

It allows users to interact with objects at a high level, without needing to know all the underlying details.

#### Reduces Complexity:

By hiding complex logic and only exposing essential functionality, abstraction reduces the complexity of the code.

#### Promotes Re-usability and Maintenance:

Abstracting out common features allows code reuse and makes it easier to maintain and update.

### Achieving Abstraction in Java

#### Abstract Classes

- An abstract class in Java is a class that cannot be instantiated on its own.
- It can contain both abstract methods (methods without a body) and concrete methods (methods with a body).
- A method that doesn't have its body known as abstract class .
- Through abstract classes cannot be instantiated , we can create subclass from it . we can then access members of the
  abstract class using the objects of the subclass.
- If the abstract class includes any abstract methods , then all the child classes inherited from the abstract super
  classes must be provided the implementation of the abstract methods.

### Code Example

```java
abstract class Animal {
    abstract void makeSound();  // Abstract method

    public void eat() {  // Concrete method
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Woof Woof
        dog.eat();       // Output: This animal is eating.

        Animal cat = new Cat();
        cat.makeSound(); // Output: Meow Meow
        cat.eat();       // Output: This animal is eating.
    }
}

```

## Interface

- An interface is a fully abstract class , it includes a group of abstract methods.
- we use interface keyword to create an interface in java.
- Like abstract class , we cannot instantiate interface
- to use interface , other class must be implemented it . we implements key to implement interface.

### Code Example

```java
interface Animal {
    void makeSound();  // Abstract method
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Woof Woof

        Animal cat = new Cat();
        cat.makeSound(); // Output: Meow Meow
    }
}

```

# Differences Between Abstract Classes and Interfaces

| Feature              | Abstract Class                                                           | Interface                                                               |
|----------------------|--------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **Usage**            | Provides partial abstraction                                             | Provides full abstraction                                               |
| **Methods**          | Can have both abstract and concrete methods                              | All methods are abstract by default (Java 7)                            |
| **Fields**           | Can have instance variables                                              | Can only have constants (static final fields)                           |
| **Inheritance**      | Allows single inheritance (one class can extend only one abstract class) | Allows multiple inheritance (a class can implement multiple interfaces) |
| **Constructors**     | Can have constructors                                                    | Cannot have constructors                                                |
| **Access Modifiers** | Can have protected and public methods                                    | All methods are implicitly public                                       |



# Exceptions
Exception is an unexpected event that occurs during program executions. When an exception occurs, Java generates an exception object, which is then thrown and can be caught and handled by the program. If not handled, it may cause the program to terminate.
Java exceptions are divided mainly into three categories:

### Checked Exceptions (Compile-time Exceptions)
- These are exceptions that must be either handled with a try-catch block or declared with a throws clause. They are checked at compile time.
- Examples include IOException, SQLException, and FileNotFoundException.

### Unchecked Exceptions (Runtime Exceptions)
- These exceptions are not checked at compile time. They occur at runtime and can be avoided by proper coding practices.
- Examples include NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.
- They inherit from RuntimeException.

### Errors
- Errors are serious issues that a program typically cannot recover from. They usually indicate underlying system problems, such as memory exhaustion.
- Examples include StackOverflowError and OutOfMemoryError.
- They inherit from Error rather than Exception and should generally not be handled by application code.

## Handling Exceptions
Java provides a robust exception-handling mechanism through the following keywords:

- try - Code that may throw an exception is placed in the try block.
- catch - This block catches and handles exceptions thrown by the try block. You can catch specific exception types or use a general Exception type.
- finally - A block that executes after the try and catch blocks, regardless of whether an exception was thrown. It’s typically used for cleanup actions like closing resources.
- throws - Used in method declarations to specify that a method can throw particular exceptions.
- throw - Used to explicitly throw an exception.
- Using e.printStackTrace() is especially useful for identifying where the exception occurred and the series of calls that led up to it.


### Code Example

```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0; // Will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
```

### IO Exceptions
- Definition: IOException is a checked exception that occurs during input/output (I/O) operations, typically involving files, networks, or data streams.
- Package: It is part of the java.io package and serves as a superclass for more specific I/O-related exceptions.
- Checked Exception: As a checked exception, IOException must be either caught using a try-catch block or declared in the method signature with throws.

### Code Example

```java
public class IOExceptions {
    public static void main(String[] args) {
        try {
            File file = new File("text.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
```

```java
public class IOExceptions {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}
```

### throws vs throw

In Java, both throw and throws are used for exception handling, but they serve different purposes:
- throw: Used to explicitly throw an exception from a method or a block of code.
- throws: Used in a method signature to declare that the method can throw exceptions, allowing the caller to handle them.


```java
public class ThrowExample {
    
    public static void main(String[] args) {
        try {
            checkAge(15); // Passing an invalid age
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method that throws an exception explicitly
    public static void checkAge(int age) {
        if (age < 18) {
            // Throwing an exception if age is less than 18
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}

```

### Customs Exceptions

In Java, custom exceptions (also known as user-defined exceptions) are exceptions that you create to handle specific error conditions that are not covered by standard Java exceptions.

```java
package exception;

class InsufficientBalanceExceptions extends Exception{
    public InsufficientBalanceExceptions(String message) {
        super(message);
    }
}

class BankAccount{
    double balance;
    BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceExceptions {
        if(amount>balance){
            throw new InsufficientBalanceExceptions("Balance is insufficient  and the current balance is "+balance);
        }else{
            balance-=amount;
            System.out.println("Amount debited successfully and the current balance is "+ balance);
        }
    }
}
public class LearnCustomsExceptions {
    public static void main(String[] args) throws InsufficientBalanceExceptions {
        BankAccount icici = new BankAccount(1000.0);
        try{
        icici.withdraw(10000);
        }catch (InsufficientBalanceExceptions e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Always Execute");
        }
    }
}

```


# Wrapper Class

In Java, wrapper classes are classes that provide a way to use primitive data types (int, double, char, etc.) as objects. Each primitive type has a corresponding wrapper class in Java, which allows primitives to be treated as objects when necessary.

#### Converting Primitive to Wrapper (Boxing)
You can convert a primitive type to its corresponding wrapper class object (boxing) manually or through autoboxing, which Java does automatically when required.

### Code Example

```agsl
int num = 5;
Integer wrappedNum = Integer.valueOf(num); // Boxing manually
Integer autoWrappedNum = num;              // Autoboxing automatically

```

### Converting Wrapper to Primitive (Unboxing)
You can convert a wrapper class object back to a primitive type (unboxing) manually or through auto-unboxing.

### Code Example
```agsl
Integer wrappedNum = 5;
int num = wrappedNum.intValue(); // Unboxing manually
int autoNum = wrappedNum;        // Auto-unboxing automatically

```

## Key Benefits of Wrapper Classes
### Collection Compatibility: 
- Collections in Java only work with objects, not primitives, so wrapper classes enable the storage of primitive types in collections.
### Utility Functions: 
- Wrapper classes offer useful methods for conversion, parsing, and checking value ranges.
### Autoboxing and Unboxing:
- Java automatically handles conversions between primitives and wrapper objects, simplifying code.

# Generics

Generics means parameterized types. Using Generics , it is possible to create classes that work with different data types . An entity such as class , interface , or method that operates on a parameterized type is a generic entity.

## Java Generics Class

### Code Example - 1

```java
class Dog<T>{
    T name;
    Dog(T name){
        this.name = name;
    }

    T getName(){
        return name;
    }
}

public class LearnGenerics {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy");
        Dog dog2 = new Dog(123);
    }
}

```

### Code Example - 2

```java
public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String,Integer> d1 = new Dog<>("12",3);
        Dog<Integer,String> d2 = new Dog<>(2,"Riyaz");
        System.out.println(d1.getId());

    }
}
class Dog<E,V>{
    E id;

    V name;

    public Dog(E id,V name){
        this.id=id;
        this.name = name;
    }

    E getId(){
        return id;
    }
}
```

## Java Generics Methods

Generics method is similar to generics class , where we parameterized the methods . 

### Code Example

```java
public class LearnGenericMethods {
    static <E> void printData(E data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        printData("Hello");
        printData(123);
    }
}
```


## Bounded Type Parameters

You can restrict the types that can be used as generic parameters using bounded type parameters. This allows you to define constraints on the types that can be used.

### Code Example

```java
public class LearnGenericMethods {
    // Supports only number class
    static <E extends Number> void printData(E data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        printData(123);
    }
}
```


## Inner classes vs outer classes
In Java, an inner class is a class defined within another class. Inner classes are useful when a class is strongly associated with another class and only exists within the scope of that class. By defining inner classes, you can logically group classes that are only used in one place, making your code more readable and easier to maintain.

```java
class OuterClass {
    private String message = "Hello from Outer Class";

    // Member Inner Class
    class InnerClass {
        public void displayMessage() {
            System.out.println(message); // Accessing outer class's private field
        }
    }

    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInner();

        // Alternative way to create an instance of InnerClass
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayMessage();
    }
}

```

- output :
```agsl
Hello from Outer Class
Hello from Outer Class
```