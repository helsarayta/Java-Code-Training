import java.util.Arrays;

public class ArrayPlusArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

//        int i = Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
        int resA = 0;
        for (int i = 0; i < arr1.length; i++) {
            resA += arr1[i];

        }
//        int resB = 0;
        for (int i = 0; i < arr2.length; i++) {
            resA += arr2[i];

        }
        System.out.println(resA);
    }
}
