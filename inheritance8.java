class account{
    void showaccount(){
        System.out.println("this is base account class");
    }
}
class saving extends account{
    void showsavinterestrate(){
        System.out.println("it has 3% intrest rate");
    }
    
}
class current extends account{
    void showcurrintrestrate(){
        System.out.println("it has 8% intrest class");
    }
}
public class inheritance8 {
    public static void main(String[] args) {
        saving s = new saving();
        s.showaccount();
        s.showsavinterestrate();

        current c = new current();
        c.showaccount();
        c.showcurrintrestrate();
    }
}
