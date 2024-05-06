import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWordName {
    public static void main(String[] args) {
        String name = "Hafsya Alvaro";

//        ===CARA LAIN===
//        String[] names = name.split(" ");
//        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();

        String collect = Arrays.stream(name.split(" ")).map(i -> i.substring(0, 1).toUpperCase()).collect(Collectors.joining("."));
        System.out.println(collect);
    }
}
