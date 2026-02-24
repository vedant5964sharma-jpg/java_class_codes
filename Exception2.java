public class Exception2 {
    static void func(){
        try{
            throw new NullPointerException("demo");

        }
        catch(NullPointerException e){
            System.out.println("caught inside fun");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            func();
        }
        catch(NullPointerException e){
            System.out.println("caught in main");
        }
    }
    
}
