import java.util.Arrays;
import java.util.List;

public class ReverseNumberToArray {
    public static void main(String[] args) {
        long n = 2345;

        int[] array = Arrays.asList(new StringBuilder(String.valueOf(n)).reverse().toString().split(""))
                .stream()
                .mapToInt(Integer::valueOf).toArray();
        System.out.println(array);


    }
}
