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
class rightangletriangle extends triangle{
    void showrightangletriangle(){
        System.out.println("this is right angle triangle class");
    }
    
}
public class inheritance5 {
    public static void main(String[] args) {
        rightangletriangle rat = new rightangletriangle();
        rat.showrightangletriangle();
        rat.showtriangle();
        rat.showshape();

    }
}
