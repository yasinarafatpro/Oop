package Oopjava;

public class CountNumberofObject {

    public static void main(String[] args) {
        A obj1=new A();
        A obj2=new A();
        A obj3=new A();
        A obj4=new A();
        
        obj2.counter();
    }

}

class A {

    static int i;
    public A(){
        i++;
    }
    public void counter(){
    
        System.out.println(i);
    }

}
