import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpinWords {
    public static void main(String[] args) {
       String word =  "Hey fellow warriors";

        String[] split = word.split("(?<=\\s|[^\\p{Alnum}])|(?=\\s|[^\\p{Alnum}])");
        List<String> ls = new ArrayList<>();

        for(int i=0; i< split.length; i++) {
            if(split[i].length() >= 5) {
                StringBuilder sb = new StringBuilder();
                sb.append(split[i]);
                sb.reverse();

                ls.add(String.valueOf(sb));
            } else {
                ls.add(split[i]);
            }

        }
        String join = String.join("", ls);

        System.out.println(join);
    }
}
