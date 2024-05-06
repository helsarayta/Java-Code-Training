import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NarcissisticNumber {
    public static void main(String[] args) {
        int number = 153;


        boolean a = Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(i -> (int) Math.pow(Integer.valueOf(i), String.valueOf(number).length()))
                .sum() == number;
        System.out.println(a);
    }
}
