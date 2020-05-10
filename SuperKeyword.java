package Oopjava;

public class SuperKeyword {

    public static void main(String[] args) {
        S2 obj1 = new S2(10);
        obj1.S3();

    }
}

class S1 {

    S1() {
        System.out.println("In S1");
    }

    S1(int i) {
        System.out.println("With Peramiter In S1");
    }

    public void S3() {
        System.out.println("Not Constructor");
    }
}

class S2 extends S1 {

    S2() {
        super();
        System.out.println("In S2");
    }

    S2(int i) {
        
        System.out.println("With Peramiter In S2");
    }
}
