package poly.ex.pay1;
public class PayMain1 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption1, amount2);

        //잘못된 결제수단
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

        // 뉴페이 결제
        String payOption4 = "newpay";
        int amount4 = 20000;
        payService.processPay(payOption4, amount4);
    }
}
