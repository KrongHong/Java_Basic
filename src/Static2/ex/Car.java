package Static2.ex;

public class Car {

    private String carName;
    private static int totalCars;
    public Car(String name) {
        this.carName = name;
        System.out.println("차량구입, 이름 : " + carName);
        totalCars++;
    }

    public static void showTotalCars()
    {
        System.out.println("구매한 차량 수 : " + totalCars);
    }

}
