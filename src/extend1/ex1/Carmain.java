package extend1.ex1;

public class Carmain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        Gascar gascar = new Gascar();

        electricCar.move();
        electricCar.charge();

        gascar.move();
        gascar.fillup();
    }
}
