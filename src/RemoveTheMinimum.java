import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class RemoveTheMinimum {
    public static void main(String[] args) {
        int[] arr = {7,3,1,2,1};

//        OptionalInt min = Arrays.stream(arr).min();
//        System.out.println(min.getAsInt());
//        int[] array = Arrays.stream(arr).filter(i -> i != min.getAsInt()).toArray();
//        System.out.println(Arrays.toString(array));

        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
           if(arr[i] < min) {
               min = arr[i];
           }
        }

        List<Integer> lInt = new ArrayList<>();
        int isGetMin = 0;
        for(int i=0; i< arr.length; i++) {
                if (arr[i] == min && isGetMin == 0) {
                    isGetMin++;
                } else {
                    lInt.add(arr[i]);
                }
        }

        lInt.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(lInt.stream().toArray());



    }
}
