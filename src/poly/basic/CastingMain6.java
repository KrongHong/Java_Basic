package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent)
    {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child) // 매개변수가 Child 인스턴스일 경우
            // 사실상 이부분에서 다운캐스팅을 해준 것이다.
            // 매개변수 parent의 인스턴스를 대입하고 왼쪽이 오른쪽에 담기는지 확인하면 된다.
        {
            System.out.println("Child 인스턴스가 맞음");
            child.childMethod();
        }
        else
        {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
