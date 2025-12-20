import java.util.*;
public class ExampleForSet {
    public static void main(String[] args) {
        
        Set s = new HashSet();
        Set s1 = new LinkedHashSet();
        Set s2 = new TreeSet();    
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("Java");
        hs.add("Python");
        System.out.println(hs);
        System.out.println("-----------------");
        System.out.println(hs.size());
        System.out.println("------------------");
        System.out.println(hs.isEmpty());
        System.out.println("-------------------");
        System.out.println(hs.clone());
        for(Object e : hs)
        {
            System.out.println(e);
        }
    }
    
}
