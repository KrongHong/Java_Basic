package poly.basic;

public class PolyMain {

    public static void main(String[] args) {

        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 부모 타입은 자식의 인스턴스를 담을 수 있다.
        poly.parentMethod();

        // Child child1 = new Parent(); // 자식은 부모를 담을 수 없다.

        // 자식의 기능은 호출할 수 없다. 컴파일 오류
        // poly.childMethod(); // poly의 타입은 parent이다. 하지만 부모타입에는 parentMethod()뿐이다.
        // -> 부모클래스에서 자식클래스의 내용을 가져오기 위해서는 캐스팅이 필요하다.
    }
}
