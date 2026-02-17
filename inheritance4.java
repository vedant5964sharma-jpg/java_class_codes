class animal{
    void showanimal(){
        System.out.println("this is animal");
    }
}

class dog extends animal{
    void showdog(){
        System.out.println("this is dog class");
    }
}
class germanshepard extends dog{
    void showgermanshepharad(){
        System.out.println("german shepard is a dog ");
    }
    
}
public class inheritance4 {
    public static void main(String[] args) {
        germanshepard gs = new germanshepard();
        gs.showdog();
        gs.showanimal();

    }
}
