import java.util.Arrays;

public class IsIsogram {
    public static void main(String[] args) {
        String str = "";

        boolean b = Arrays.stream(str.toUpperCase().split("")).distinct().count() == str.length();
        System.out.println(b);

    }
}
