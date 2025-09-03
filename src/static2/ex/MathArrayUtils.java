package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    private static int sum;
    private static double average;
    private static int min;
    private static int max;
    public static int sum(int[] values){
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values){
        average = (double) sum /values.length;
        return average;
    }

    public static int min(int[] values){
        min = values[0];
        for (int value : values) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values){
        max = values[0];
        for (int value : values) {
            max = value;
            if (max < value) {
                max = value;
            }
        }
        return max;

    }
}
