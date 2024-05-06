import java.util.Arrays;

public class RomanNumerals {
    public static void main(String[] args) {
        System.out.println(romanNumeral(2890));
    }

    public static String romanNumeral(int n) {
        String nNum = "";

        String cvt = Integer.toString(n);

        String[] split = cvt.split("");
        String[] aNum = new String[split.length];
        for(int i=0; i < split.length; i++) {
            if(i == 0) {
                aNum[i] = split[i];
            } else {
                aNum[i] = "0";
            }
        }

        String join = String.join("", aNum);
        System.out.println(join);

//        String[] arrNum = new String[cvt.length()];
//        for(int i=1; i < cvt.length(); i++) {
//            if(i < cvt.length()) {
//                arrNum[i] = "0";
//            }
//        }
//
//        System.out.println(String.join("",arrNum));

        return "done";

    }
}
