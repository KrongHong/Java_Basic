package extend1.ex2;

public class ElectricCar extends Car {
    // 부모의 기능을 물려받았기 때문에 move()는 작성하지 않아도 된다.
    public void charge()
    {
        System.out.println("차를 충전합니다.");
    }
}
