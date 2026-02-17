class parent{
    final void display(){
        System.out.println("final method in parent class");

    }
}
class child extends parent{
    // void display(){
    //     super.display(); // nahi hoga ye execute 
    // }
}
public class final1 {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}
