package learnPackages;

public class Teacher {
    public int teachingClass;
    private int id;

    String degree; // default or package private

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.id = 12;
    }
}
