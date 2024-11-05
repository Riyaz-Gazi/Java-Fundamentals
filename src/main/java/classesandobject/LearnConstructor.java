package classesandobject;

public class LearnConstructor {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println(area.a);
        area.print();
        Area area1 = new Area(2,3);
        area1.print();
        Area area2 = new Area(12);
        area2.print();
    }
}

class Area{
    int a,b;
    public Area(){
    }

    public Area(int a){
        this.a = a;
        this.b = 12;
    }
    public Area(int a,int b){
        this.a=a;
        this.b=b;
    }

    void print(){
        System.out.println(a+"+"+b+"i");
    }
    
}