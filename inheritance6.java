class animal{
    void showanimal(){
        System.out.println("this is animal class");
    }
}

class dog extends animal{
    void showdog(){
        System.out.println("this is dog class");
    }
}
class cat extends animal{
    void showcat(){
        System.out.println("this is cat class");
    }
    
}
public class inheritance6 {
    public static void main(String[] args) {
        cat c = new cat();
        c.showanimal();
        c.showcat();

        dog d = new dog();
        d.showanimal();
        d.showdog();
    }
}
