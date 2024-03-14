package Static2.ex;

public class MathArrayUtils {

    private MathArrayUtils()
    {
        // 인스턴스를 사용하지 못하게 막아버림
    }

    public static int sum(int[] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        return sum;
    }

    public static double average(int[] array)
    {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array)
    {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }

        return min;
    }

    public static int max(int[] array)
    {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }

        return max;
    }
}
