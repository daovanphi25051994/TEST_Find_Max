import java.lang.reflect.Array;

public class FindMaxOfArray {
    public static void main(String[] args) {
        double[] arr = {3.4, 5.5, 7.7};
        double max = (double) getMax(arr);
        System.out.printf("max = %f", max);
    }

    public static double getMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
