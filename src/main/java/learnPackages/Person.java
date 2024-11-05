package learnPackages;

public class Person {

    public static int count = 0;

    public static final double pi = Math.PI;
    private int age;
    private String name;

    boolean canBeChanged = true;

    public Person(){
        count++;
    }

    public void setAge(int age) {
        if (canBeChanged) {
            if (age > 0) {
                this.age = age;
            }
        }
    }

    boolean canBeAccessed = true;

    public int getAge() {
        if (canBeAccessed) {
            return age;
        } else {
            return -1;
        }

    }
}
