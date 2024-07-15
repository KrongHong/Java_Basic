package poly.ex.pay2;

public abstract class PayStore {

    // 결제수단 추기시 변경해야하는 부분
    // 서버가 받는 부분
    public static Pay findPay(String option){
        if (option.equals("kakao")){
            return new KakaoPay();
        }else if (option.equals("naver")){
            return new NaverPay();
        }else if (option.equals("newpay")){
            return new NewPay();
        }
        else{
            return new DefaultPay();
        }
    }
}
