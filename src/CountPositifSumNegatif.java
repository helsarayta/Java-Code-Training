import java.util.Arrays;

public class CountPositifSumNegatif {
    public static void main(String[] args) {
        int[] input = null;
        if(input != null) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        if(input.length == 0) {
            System.out.println(0);
        }
        long count = Arrays.stream(input).filter(i -> i >= 0).count();
        int sum = Arrays.stream(input).filter(i -> i < 0).sum();
        int[] result = {(int)count,sum};
        System.out.println(Arrays.toString(result));
    }

    public static int[] countAnsSum(int[] input) {
        return new int[]{(int)Arrays.stream(input).filter(i -> i >= 0).count(),Arrays.stream(input).filter(i -> i < 0).sum()};
    }
}
