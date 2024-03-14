package Static2.ex;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] value = {1,2,3,4,5};
        System.out.println("sum = " + MathArrayUtils.sum(value));
        System.out.println("average = " + MathArrayUtils.average(value));
        System.out.println("min = " + MathArrayUtils.min(value));
        System.out.println("max = " + MathArrayUtils.max(value));
    }
}
