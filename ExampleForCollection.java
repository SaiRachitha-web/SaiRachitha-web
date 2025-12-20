import java.util.*;

public class ExampleForCollection {
    public static void main(String[] args) {

        List<Integer> l1 = new Vector<>();
        List<Integer> l2 = new Stack<>();
        List<Integer> l3 = new LinkedList<>();

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        for (Object i : l) {
            System.out.println(i);
        }

        System.out.println("---------------------------");

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(50);
        a1.add(60);
        a1.add(70);
        a1.add(10);

        System.out.println("ArrayList : " + a1);
    }
}
