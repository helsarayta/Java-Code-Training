import java.util.Arrays;

public class LostWithoutAMap {
    public static void main(String[] args) {
        int[] num = {2,3,4};

        int[] array = Arrays.stream(num).map(i -> i * i).toArray();
        System.out.println(Arrays.toString(array));
    }
}
