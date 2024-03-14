package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCounter;

    public void addItem(Item item)
    {
        if(itemCounter >= items.length)
        {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCounter] = item;
        itemCounter++;

    }

    public void displayItems()
    {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCounter; i++)
        {
            Item item = items[i]; // item을 하나를 꺼내는 작업
            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getTotal());
        }

        System.out.println("전체 가격 합 : " + calculateTotal());
    }

    private int calculateTotal()
    {
        int total = 0;
        for (int i = 0; i < itemCounter; i++)
        {
            Item item = items[i];
            total += item.getTotal();
        }

        return total;
    }
}
