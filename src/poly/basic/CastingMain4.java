package poly.basic;
// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음


        Parent parent2 = new Parent(); // 인스턴스를 생성할때 자식에 관련된 인스턴스가 아예 존재를 하지 않는다.
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastExcoption
        child2.childMethod(); // 실행 불가
    }
}
