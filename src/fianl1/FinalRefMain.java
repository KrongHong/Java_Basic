package fianl1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data(); // data라는 참조형을 final로 설정하면서 주소값 고정
        //data = new Data();
        
        // 참조대상의 값은 변경 가능!!
        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);
    }
}
