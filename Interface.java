interface Animal{
    void sound();
    void sleep();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("dog barks");
    }
    public void sleep(){
        System.out.println("dog sleeps");
    }
    public void bark(){
        System.out.println("dog bite");
    }
}
public class Interface{
    public static void main(String[] args){
        Animal a=new Dog();
        a.sound();
        a.sleep();
        Dog d=new Dog();
        d.bark();
    }
}