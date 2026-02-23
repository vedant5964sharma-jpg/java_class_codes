public class MultipleCatch {
    public static void main(String[] args){
        try{
            String str=null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("error:null pointer exception!");
        }catch(Exception e){
            System.out.println("some other error occured");
        }
    }
    
}
