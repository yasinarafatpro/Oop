package Oopjava;
import static java.lang.System.out;

public class Encapsulation {

    public static void main(String[] args) {
        A1 obj=new A1();
        obj.setI(5);
        obj.setName("Yasin");
        
        out.println(obj.getI());
        out.println(obj.getName());
    }
}

class A1 {

    private int i;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setI(int j) {
        i = j;
    }

    public int getI() {
        return i;
    }
}
