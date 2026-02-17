class outer{
    class inner{
        void display(){
            System.out.println("inner class method");
        }
    }
}
public class innerclass {
    public static void main (String[] args) {
        outer.inner obj = new outer().new inner();
        obj.display();
        
    }
}
