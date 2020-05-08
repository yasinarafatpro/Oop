package Oopjava;

public class Inheritence {

    public static void main(String[] args) {
        second c1=new second();
        
    }
}

class Constructor {

    Constructor() {
        System.out.println("In Constructor");
    }

    Constructor(int a) {
        System.out.println("In Constructor with paramiter");
    }
}
class second extends Constructor{
    second(){
        System.out.println("In second");
    }
    second(int b){
        System.out.println("In second with peramiter");
    }
}
