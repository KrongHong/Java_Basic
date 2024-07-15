package poly.ex.pay0;

public class PayService {


    // 내부에서 구현되는 핵심 로직들이 존재한다. -> 여기서 리펙토링을 해줘야한다.
    // 변경이 되야하는 부분과 변경이 되지 않아도 되는 부분을 나누어서 class를 작성하는 OCP기준에 맞게 설계된 것이다.
    public void processPay(String option, int amount){

        boolean result;
        System.out.println("결제를 시작합니다 : option = " + option + ", amount = " + amount);

        if (option.equals("kakao")){
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        }else if (option.equals("naver")){
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        }else{
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }
        // result가 boolean 타입이라 true이면 if문을 실행하는 의미를 가진다.
        if(result){
            System.out.println("결제를 성공했습니다.");
        }else{
            System.out.println("결제를 실패했습니다.");
        }
    }
}
