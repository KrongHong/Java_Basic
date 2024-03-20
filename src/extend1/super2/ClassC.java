package extend1.super2;

public class ClassC extends ClassB{

    public ClassC()
    {
        super(10,20); //ClassB의 생성자는 기본생성자가 아니기 때문에 super()만 하면 컴파일 오류가 생긴다.
        System.out.println("ClassC 생성자");
    }
}
