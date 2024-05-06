import java.util.Arrays;

public class ArraysContainValue {
    public static void main(String[] args) {
        Object[] number = {80, 117, 115, 104, 45, 85, 112, 115};
        Object[] word = {"what", "a", "great", "kata"};

        Arrays.asList(number).contains(80); // simple

        boolean b = Arrays.stream(number).anyMatch(i -> String.valueOf(i).equals(String.valueOf(80)));

        System.out.println(b);
    }
}
