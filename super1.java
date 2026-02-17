class parent{
    void display(){
        System.out.println("parent class method");
    }
}
class child extends parent{
    void display(){
        super.display(); // upar wali class ke function bulata hai
        System.out.println("child class method");
    }
}
class grandchild extends child{
    void display(){
        super.display();
        System.out.println("grandchild class method");
    }
}
public class super1 {
    public static void main(String[] args){
        child c = new child();
        c.display();
    }
}
