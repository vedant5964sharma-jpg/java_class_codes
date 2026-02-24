class Superclass {
    void method() {
        System.out.println("This is the method of superclass");
    }
}

class Subclass extends Superclass {
    @Override
    void method() {
        System.out.println("This is the method of subclass");
        throw new ArithmeticException("This is an exception thrown from subclass method");
    }


    public class Superclass {   // public class must match file name (Main.java)
        public static void main(String[] args) {

            Subclass s = new Subclass();

            try {
                s.method();
            } 
            catch (ArithmeticException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
        }
    }
}