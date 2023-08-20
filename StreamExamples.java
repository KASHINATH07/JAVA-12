import java.util.*;
import java.util.stream.Stream;
public class StreamExamples {
    public static void main(String[] args) {
       List<Integer> l1= Arrays.asList(10,20,33,40);
       Stream s=l1.stream().filter(n-> n%2==0);
       System.out.println("Even numbers in the list are:");
       s.forEach((n)-> System.out.println(n));
    }
}
