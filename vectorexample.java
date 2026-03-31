import java.util.Vector;
public class vectorexample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println("Size of the Vector: " + numbers.size());
        System.out.println("Element at index 0: " + numbers.get(0));
    }
}
