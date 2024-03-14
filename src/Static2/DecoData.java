package Static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall()
    {
        //instanceValue; // 인스턴스 변수 접근 -> compile error
        //instanceMeothd(); // 인스턴스 매서드 접근 -> complie error

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 매서드 접근
    }

    public void instanceCall()
    {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 매서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 매서드 접근
    }

    public static void staticCall(DecoData data) // 인스턴스를 통해 참조값을 가져온다.
    {
        data.instanceCall();
        data.instanceMethod();
    }

    private void instanceMethod()
    {
        System.out.println("instanceMethod = " + instanceValue);
    }

    private static void staticMethod()
    {
        System.out.println("staticMethod = " + staticValue);
    }
}
