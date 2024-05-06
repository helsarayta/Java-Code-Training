import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String name = "Hafsya Alvaro";

        String[] split = name.split(" ");
        System.out.println(Arrays.toString(split));
    }
}
