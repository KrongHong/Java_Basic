package poly.ex.pay2;

public class PayService {
    // 어디에서도 카카오페이나 네이버 페이를 찾아볼 수 없다 역할에만 충실한다.
    // 실제 클라이언트가 전송하는 부분
    public void processPay(String option, int amount){
        System.out.println("결제를 시작합니다 : option = " + option + ", amount = " + amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if(result){
            System.out.println("결제를 성공했습니다.");
        }else{
            System.out.println("결제를 실패했습니다.");
        }
    }
}
