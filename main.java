class Demo {

    Demo() {
        this("Default Constructor"); // Calls parameterized constructor
    }

    Demo(String message) {
        System.out.println(message);
    }
    
}

public class main {
    public static void main(String[] args) {
        new Demo();
    }
}
