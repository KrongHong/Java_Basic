package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car); // 이 시점부터 k3Car의 인스턴를 가지게 된다.
        // driver가 차를 가지게 되는 것이다.
        driver.drive();

        // 추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);

        driver.drive();
    } 
}
