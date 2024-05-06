import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,4,5,6};
        int[] b = {4,2};

        System.out.println(Arrays.toString(removeElements(a,b)));


    }

    private static int[] removeElements(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            boolean foundInB = false;

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    foundInB = true;
                    break;
                }
            }

            if (!foundInB) {
                result.add(a[i]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
