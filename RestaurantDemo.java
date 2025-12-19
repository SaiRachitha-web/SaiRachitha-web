class Restaurant {
    String order;
    boolean ordered = false, cooked = false;

    synchronized void foodOrder(String o) {
        while (ordered) try { wait(); } catch (Exception e) {}
        order = o;
        System.out.println("Waiter took order: " + order);
        ordered = true;
        notifyAll();
    }

    synchronized void cookOrder() {
        while (!ordered) try { wait(); } catch (Exception e) {}
        System.out.println("Chef is cooking the order");
        cooked = true;
        notifyAll();
    }

    synchronized void receivedOrder() {
        while (!cooked) try { wait(); } catch (Exception e) {}
        System.out.println("Customer received: " + order);
    }
}

class Customer extends Thread {
    Restaurant r;
    Customer(Restaurant r) { this.r = r; }
    public void run() { r.receivedOrder(); }
}

class Waiter extends Thread {
    Restaurant r;
    Waiter(Restaurant r) { this.r = r; }
    public void run() { r.foodOrder("Pizza"); }
}

class Cook extends Thread {
    Restaurant r;
    Cook(Restaurant r) { this.r = r; }
    public void run() { r.cookOrder(); }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        new Customer(r).start();
        new Cook(r).start();
        new Waiter(r).start();
    }
}
