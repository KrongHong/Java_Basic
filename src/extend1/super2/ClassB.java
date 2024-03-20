package extend1.super2;

public class ClassB extends ClassA{

    public ClassB(int a)
    {
        super(); // 기본 생성자 생략 가능
        // 원래는 적어줘야한다. 하지만 부모의 기본 생성자는 생략이 가능하다
        System.out.println("Class B 생성자 a = " + a);
    }

    public ClassB(int a , int b)
    {
        super(); // 기본 생성자 생략 가능
        System.out.println("Class B 생성자 a = " + a + ", b = " + b);
    }
}
