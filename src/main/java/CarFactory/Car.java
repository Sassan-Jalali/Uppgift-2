package CarFactory;

public abstract class Car {

    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }

    private void arrangeParts() {

    }


     abstract void construct();

    public CarType model;


}