package CarFactory;

public class LuxuryCar extends Car {

    LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
     void construct() {
        System.out.println("Building Luxury Car");

    }
}
