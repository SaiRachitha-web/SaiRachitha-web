import java.util.*;
public class ExampleForVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector();
        v.add("java");
        v.add("python");
        v.add("c++");
        v.add("C");
        System.out.println(v);
        System.out.println("----------------");
        System.out.println(v.get(2));
        System.out.println("----------------");
        System.out.println(v.isEmpty());
        System.out.println("-----------------");
        System.out.println(v.contains(2));
        System.out.println("-----------------");
        System.out.println(v.size());
        System.out.println("------------------");
        for(Object i : v){
            System.out.println(v);
        }
    }
    
}
