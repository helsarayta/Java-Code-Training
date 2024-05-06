import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareEveryDigit {
    public static void main(String[] args) {
     int n = 9119;

        String collect = Arrays.asList(String.valueOf(n).split(""))
                .stream()
                .map(i -> String.valueOf((int)(Math.pow(Double.valueOf(i), 2))))
                .collect(Collectors.joining(""));
        System.out.println(Integer.valueOf(collect));

//        Arrays.stream(split).map().map(i -> Math.sqrt(Double.valueOf(i)));
    }
}
