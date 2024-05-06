import java.util.Arrays;

public class SumOfPositiveArray {

    public static void main(String[] args) {
        int[] arr = {5,3,-7};
        int sum = Arrays.stream(arr).filter(i -> i > 0).sum();
        System.out.println(sum);
    }
}
