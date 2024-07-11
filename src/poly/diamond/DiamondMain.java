package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child(); // InterfaceA는 인스턴스로 생성할 수 없다.
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child(); // InterfaceA는 인스턴스로 생성할 수 없다.
        b.methodB();
        b.methodCommon();

        Child c = new Child();
        c.methodCommon();
    }
}
