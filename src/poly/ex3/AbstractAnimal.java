package poly.ex3;

public abstract class AbstractAnimal { // 추상메서드가 하나이상 존재하기 때문에 무조건 추상클래스로 선언해야한다.

    public abstract void sound(); // 자식에서 반드시 오버라이딩 해야한다.

    public void move()
    {
        System.out.println("동물이 움직입니다.");
    }
}
