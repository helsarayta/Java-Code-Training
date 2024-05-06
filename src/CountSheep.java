import java.util.Arrays;
import java.util.Collections;

public class CountSheep {
    public static void main(String[] args) {
//        Boolean[] sheep = {true,  true,  true,  false,
//                true,  true,  true,  true ,
//                true,  false, true,  false,
//                true,  false, false, true ,
//                true,  true,  true,  true ,
//                false, false, true,  true};
        Boolean[] sheep = {true, null, false, null};
        int frequency = Collections.frequency(Arrays.asList(sheep), true); //simple


        int count = (int) Arrays.asList(sheep).stream().filter(i -> (i != null && i)).count();



        System.out.println(count);
    }
}
