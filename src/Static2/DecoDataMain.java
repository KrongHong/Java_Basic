package Static2;

// import static static2.DecoData.*; // static 없어도 사용가능 alt+enter

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적호출");
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1);

        // 추가
        DecoData data3 = new DecoData();
        data3.staticCall(); // 메서드 영역에 있는 값을 다시 보낸다.
        // 마치 인스턴스 소속 같은 느낌 -> 코드 이해가 어려워진다.

        // 클래스를 통한접근
        DecoData.staticCall();
    }
    // instanceCall()의 경우 ++를 해도 새로운 객체를 만들어야 하기 때문에 초기화가 되지만
    // staticCall()의 경우 클래스쪽 메서드 영역에 있기 때문에 ++를 하면 숫자가 증가하게 된다.



}
