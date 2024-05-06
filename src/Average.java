import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        if(arr.length == 0) {
//            System.out.println(0);
//        }
        Arrays.stream(arr).average().orElse(0); //simple
        Double sum = (double)(Arrays.stream(arr).sum()) / Double.valueOf(arr.length);
        System.out.println(sum);
    }
}
