package fianl1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능


        //final 지역변수2
        final int data2 = 10;
        // data2 = 20; 컴파일오류
        method(10); // parameter값이 10으로 고정 so, parameter값을 20으로 바꿀 수 없다.
    }

    static void method(final int parameter)
    {
        // parameter = 20; // 컴파일 오류

    }
}
