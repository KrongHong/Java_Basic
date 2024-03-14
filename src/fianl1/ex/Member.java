package fianl1.ex;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name)
    {
        // this.id = id; // final이라 바꿀 수 없다
        this.name = name;
    }

    public void print()
    {
        System.out.println("id: " + id + ", name : " + name);
    }
}
