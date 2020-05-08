package Oopjava;

public class DynamicMethoddispatch {

    public static void main(String[] args) {
        AA obj1 = new AA();
        BB obj2 = new BB();
        BB a;
        a = obj2;

        a.show();
    }
}

class AA {

    public void show() {
        System.out.println("Show in AA");
    }

}

class BB extends AA {

    public void show() {
        System.out.println("Show in BB");
    }
}
