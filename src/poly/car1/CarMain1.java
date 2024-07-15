package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        // setCar의 경우 Car car = k3Car와 같은 뜻이다. 부모는 자식을 받을 수 있다.
        driver.driver();

        // 차량 변경(k3 -> model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.driver();

        // 차량 변경(model3 -> newCar)
        newCar newCar = new newCar();
        driver.setCar(newCar);
        driver.driver();
    }
}
