package extend1.super1;

public class Child extends Parent {

    public String value = "Child";

    @Override
    public void hello()
    {
        System.out.println("Child.hello");
    }

    public void call()
    {
        System.out.println("this value = " + this.value); // this는 자기자신, 생략할 경우 호출한 타입부터 출력
        System.out.println("super value = " + super.value); // super는 부모



        this.hello();
        super.hello();
    }
}
