package poly.ex.pay2;


import poly.ex.pay1.PayService;

import java.util.Scanner;

public class PayMain2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요 : ");
            String option = cin.nextLine();

            if (option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }

            System.out.print("결제 금액을 입력하세요 : ");
            int amount = cin.nextInt();

            payService.processPay(option, amount);

            cin.nextLine();
        }
    }
}
