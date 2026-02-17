class parent {
    void display(){
        System.out.println("parent class method");
    }
}
class child extends parent{
    void show(){
        System.out.println("child class method");
    }
}
public class inheritance2 {
    public static void main(String[] args) {
        child c =new child();
        c.display();
        c.show();

    }   
}
