package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 :");
        int n = cin.nextInt();
        cin.nextLine();
        ProdectOrder[] prodectOrderps = new ProdectOrder[n];

        for (int i = 0 ; i < n; i++)
        {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String name = cin.nextLine();


            System.out.print("가격 : ");
            int price = cin.nextInt();


            System.out.print("수량 : ");
            int quan = cin.nextInt();
            cin.nextLine();

            prodectOrderps[i] = createOrder(name, price, quan);
        }
        printOrder(prodectOrderps);
        int totalAmonut = getTotalAmount(prodectOrderps);
        System.out.println("총 결제 금액 : " + totalAmonut);
    }

    static ProdectOrder createOrder(String nm, int price, int quan){
        ProdectOrder prodectOrder = new ProdectOrder();
        prodectOrder.productName = nm;
        prodectOrder.price = price;
        prodectOrder.quantity = quan;

        return prodectOrder;
    }

    static void printOrder(ProdectOrder[] prodectOrder){
        for (int i = 0; i < prodectOrder.length; i++)
        {
            System.out.println("상품명 : " + prodectOrder[i].productName +
                    ", 가격 : " + prodectOrder[i].price + ", 수량 : " + prodectOrder[i].quantity);
        }
    }

    static int getTotalAmount(ProdectOrder[] orders) {
        int total = 0;
        for (int i = 0; i < orders.length; i++){
            total += orders[i].price * orders[i].quantity;
        }

        return total;
    }
}
