import java.util.ArrayList;
import java.util.List;

public class RgbToHex {
    public static void main(String[] args) {
        int r = -20;
        int g = 275;
        int b = 125;

        //Simple
        String format = String.format("%02X%02X%02X",
                r > 0 ? Math.min(255, r) : 0,
                g > 0 ? Math.min(255, g) : 0,
                b > 0 ? Math.min(255, b) : 0);

        System.out.println(format);

        //This mine
//        if(r > 255) {
//            r = 255;
//        } else if (r < 0) {
//            r = 0;
//        }
//
//        if(g > 255) {
//            g = 255;
//        } else if (g < 0) {
//            g = 0;
//        }
//
//        if(b > 255) {
//            b = 255;
//        } else if (b < 0) {
//            b = 0;
//        }
//
//
//        List<String> sL = new ArrayList<>();
//        sL.add(String.valueOf(r/16));
//        sL.add(String.valueOf(r-((r/16)*16)));
//        sL.add(String.valueOf(g/16));
//        sL.add(String.valueOf(g-((g/16)*16)));
//        sL.add(String.valueOf(b/16));
//        sL.add(String.valueOf(b-((b/16)*16)));
//        for (String i : sL) {
//            switch (i) {
//                case "10" : sL.set(sL.indexOf(i), "A");
//                    break;
//                case "11" : sL.set(sL.indexOf(i), "B");
//                    break;
//                case "12" : sL.set(sL.indexOf(i), "C");
//                    break;
//                case "13" : sL.set(sL.indexOf(i), "D");
//                    break;
//                case "14" : sL.set(sL.indexOf(i), "E");
//                    break;
//                case "15" : sL.set(sL.indexOf(i), "F");
//                    break;
//            }
//        }
//
//        System.out.println(String.join("",sL));
    }
}
