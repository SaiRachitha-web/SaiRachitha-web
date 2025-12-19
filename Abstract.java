abstract class Plane {
    abstract void takeOff();
    abstract void fly();
    abstract void land();
}

class CargoPlane extends Plane {
    void takeOff() {
        System.out.println("CargoPlane is taking off");
    }

    void fly() {
        System.out.println("CargoPlane is flying at low height");
    }

    void land() {
        System.out.println("CargoPlane is landing");
    }
}

class PassengerPlane extends Plane {
    void takeOff() {
        System.out.println("PassengerPlane is taking off");
    }

    void fly() {
        System.out.println("PassengerPlane is flying at medium height");
    }

    void land() {
        System.out.println("PassengerPlane is landing");
    }
}

class FighterPlane extends Plane {
    void takeOff() {
        System.out.println("FighterPlane is taking off");
    }

    void fly() {
        System.out.println("FighterPlane is flying at high speed");
    }

    void land() {
        System.out.println("FighterPlane is landing");
    }
}

class Airport {
    void permit(Plane ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

public class Abstract {
    public static void main(String[] args) {

        Plane cp = new CargoPlane();
        Plane pp = new PassengerPlane();
        Plane fp = new FighterPlane();

        Airport airport = new Airport();

        airport.permit(cp);
        airport.permit(pp);
        airport.permit(fp);
    }
}
