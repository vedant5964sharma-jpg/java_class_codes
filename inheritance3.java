class grandparents{
    void showgrandparent(){
        System.out.println("grandparent class");
    }
}
class parent extends grandparents{
    void showparent(){
        System.out.println("this is parent class");
    }
}
class child extends parent{
    void showchild(){
        System.out.println("this is child class");
    }
}
public class inheritance3 {
    public static void main(String[] args) {
        child c = new child();
        c.showparent();
        c.showgrandparent();
    }
}
