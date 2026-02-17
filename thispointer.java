class student {
    
    String name;
    student(String name){
        this.name = name;
    }
    void display(){
        System.out.println("student name is: " + this.name);
    }
}
public class thispointer {
    public static void main(String[] args) {
        student s1 = new student("Alice");
        s1.display();

        
    }
}
