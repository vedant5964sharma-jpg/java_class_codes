class animal{
    void eat(){
        System.out.println("the animal eats food");
    }
    void mamals(){
        System.out.println("all mamals are animals");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog barks");
    }
    void eat(){
        System.out.println("dog eats dog food");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.bark();
        d.eat();
        d.mamals();
        

    }
}
