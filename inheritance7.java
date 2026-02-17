 class shape{
    void showshape(){
        System.out.println("this is shape class");
    }
}

class triangle extends shape{
    void showtriangle(){
        System.out.println("this is triangle class");
    }
}
class circle extends shape{
    void showcircle(){
        System.out.println("this is circle class");
    }
    
}
public class inheritance7 {
    public static void main(String[] args) {
        circle c = new circle();
        c.showcircle();
        c.showshape();

        triangle t = new triangle();
        t.showshape();  
        t.showtriangle();

    }
}

