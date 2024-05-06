import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortTheOdd {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    //===========CARA KE 1=================
        // Sort the odd numbers only
//        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
//
//        // Then merge them back into original array
//        for (int j = 0, s = 0; j < array.length; j++) {
//            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
//        }
    //==========================================

        //===========CARA KE 2=================
        PrimitiveIterator.OfInt sortedOdds = IntStream.of(array).filter(i -> i % 2 == 1).sorted().iterator();
        IntStream.of(array).map(i -> i % 2 == 0 ? i : sortedOdds.nextInt()).toArray();
//        =======================================

    }
    //===========CARA KE 3=================
//    for(int i=0; i < array.length; i++) {
//        for (int j=0; j < array.length; j++) {
//            if((array[i]%2!=0) && (array[j]%2!=0)) {
//                if(array[i] < array[j]) {
//                    array[i] = array[i]^array[j];
//                    array[j] = array[i]^array[j];
//                    array[i] = array[i]^array[j];
//                }
//            }
//        }
//    }
//        System.out.println(Arrays.toString(array));
//    }
//    ========================================
}
