package poly.car1;

public class newCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("newCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("newCar.offEngine");
    }

    @Override
    public void pressAccelrator() {
        System.out.println("newCar.pressAccelrator");
    }
}
