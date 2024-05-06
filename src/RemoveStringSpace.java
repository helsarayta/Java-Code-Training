import java.util.Arrays;

public class RemoveStringSpace {
    public static void main(String[] args) {
        String x = "8 j 8   mBliB8g  imjB8B8  jl  B";

        String replace = x.replace(" ", "");
        System.out.println(replace);
//        StringBuilder sb = new StringBuilder(x);
//        sb.trimToSize();
//        System.out.println(sb);
    }
}
