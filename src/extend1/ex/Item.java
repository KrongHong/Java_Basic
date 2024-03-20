package extend1.ex;

public class Item {

    private String name;
    private int price;

    public Item(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public void print() // print()가 반복되므로 Override를 이용해서 하면 유지보수가 수월해진다.
    {
        System.out.println("이름 : " + getName() + ", 가격 : " + getPrice());
    }
}
