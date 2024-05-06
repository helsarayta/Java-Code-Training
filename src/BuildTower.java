import java.util.ArrayList;
import java.util.List;

public class BuildTower {
    public static void main(String[] args) {
        int floor = 3;

//        for(int i = 1; i <= floor*2; i++) {
//
//            for(int k = 0; k < floor; k++) {
//                System.out.print(" ");
//            }
//
//            for(int j=0; j < i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//            i++;
//        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < floor; i++) {
            // Print spaces to center the triangle
            for (int j = 0; j < floor - i - 1; j++) {
//                System.out.print(" ");
                list.add("\" \"");
            }
            // Print asterisks for the triangle
            for (int k = 0; k < 2 * i + 1; k++) {
//                System.out.print("*");
                list.add("*");
            }
            System.out.println(); // Move to the next line
        }

        System.out.println(list);
    }
}
