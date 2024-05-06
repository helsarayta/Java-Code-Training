import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString {
    public static void main(String[] args) {
//        String s = "ab cdf";
//        [He,ll,o[ ],Wo,rl,d_]
        String s = "Hello World";
//        System.out.println(Arrays.toString(solution(s)));
        if(s.contains(" ")) {
            s.replace(" ","[ ]");
        }

        System.out.println(s);
//            if(s.length() % 2 != 0) {
//                    s += "_";
//            }
//        String[] split = s.split("");
//
//        List<String> list = new ArrayList<>();
//
//        for(int i=0; i < s.length(); i++) {
//            StringBuilder sb = new StringBuilder();
//            StringBuilder append = sb.append(split[i]).append(split[i+1]);
//            String trim = append.toString().trim();
//            list.add(trim);
//            i++;
//        }
//
//
//        System.out.println(Arrays.toString(list.toArray(new String[list.size()])));
    }

    public static String[] solution(String s) {
        if(s.length() % 2 != 0) {
            s += "_";
        }
        String[] split = s.split("");

        List<String> list = new ArrayList<>();

        for(int i=0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            StringBuilder append = sb.append(split[i]).append(split[i+1]);
            String trim = append.toString().trim();
            list.add(trim);
            i++;
        }
        return list.toArray(new String[list.size()]);
    }
}
