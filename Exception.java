public class Exception {
    public static void main(String[] args) {
        try{
            throw new NullPointerException("demo");

        }
        catch(NullPointerException e){
            System.out.println("caught inside fun().");
            throw e;
        }
    }
    
}
