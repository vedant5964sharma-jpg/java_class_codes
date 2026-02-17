class Demo{
    Demo(){
        this("default constuctor");
    }

    Demo(String message){
        System.out.println(message);
    }
    Demo(int number){
        System.out.println(number);
    }
}
public class this2 {
    public static void main(String[] args) {
        new Demo();
        new Demo(500);
    }
}
