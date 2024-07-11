package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();

        // Caw[] cawArr = {dog, cat , caw}; // caw와 다른 타입이라 나머지를 담을 수 없다.
        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        soundCat(cat);
        soundCaw(caw);

    }
    private static void soundCat(Cat cat)
    {
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void soundCaw(Caw caw)
    {
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
