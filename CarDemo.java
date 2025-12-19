class Car {
    private String name;
    private String color;
    private int mileage;
    public void setData(String n, String c, int m) {
        name = n;
        color = c;
        mileage = m;
    }
    public void showData() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(mileage);
    }
}
public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.setData("Swift", "Red", 22);
        c.showData();
    }
}

