class Demo {
    int n1 = 25;
    int n2 = 0;

    void div() throws ArithmeticException {
        System.out.println(n1 / n2);
    }
}

public class Throws {
    public static void main(String[] args) {
        Demo d = new Demo();

        try {
            d.div();
        } catch (Exception e) {
            System.err.println("Exception occurred: " + e);
        }
    }
}
