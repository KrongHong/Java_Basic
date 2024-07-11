package poly.ex4;

public class Dog extends AbstractAnimal {

    @Override
    public void sound()
    {
        System.out.println("바우바우");
    }

    @Override
    public void move()
    {
        System.out.println("개 이동");
    }


}
