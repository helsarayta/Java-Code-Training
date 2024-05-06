import java.util.Arrays;

public class SumOddOrEven {
    public static void main(String[] args) {
        int[] array = {0,3,2};

        String res = Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";

        System.out.println(res);

    }
}
