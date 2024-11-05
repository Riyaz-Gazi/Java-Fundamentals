package polymorphism;

class Student{
    public void display(){
        System.out.println("Student");
    }
}

class UndergraduateStudent extends Student{
    @Override
    public void display(){
        System.out.println("This is UnderGraduate Student");
    }
}

class PostGraduateStudent extends Student{
    @Override
    public void display(){
        System.out.println("This is PostGraduate Student");
    }
}

public class LearnMethodOverriding {
    public static void main(String[] args) {
        Student student = new Student();
        Student underGraduateStudent = new UndergraduateStudent();
        Student postGraduateStudent = new PostGraduateStudent();

        student.display();
        underGraduateStudent.display();
        postGraduateStudent.display();
        postGraduateStudent.display();
    }
}
