package CarFactory;

public class SmallCar extends Car {

    SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    @Override
     void construct() {
        System.out.println("Building a small car");

    }
}