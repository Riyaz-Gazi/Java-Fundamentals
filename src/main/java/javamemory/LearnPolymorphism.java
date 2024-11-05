package javamemory;

class Data {
    int data;
}

public class LearnPolymorphism {
    public static void main(String[] args) {
        int a=5;
        Data obj = new Data();
        obj.data=5;
        changeValue(a,obj);
        System.out.println(a);
        System.out.println(obj.data);

    }
    static void changeValue(int a,Data obj){
        a=10;
        obj.data=100;
    }
}
