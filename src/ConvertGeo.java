import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertGeo {
    public static void main(String[] args) {
        //(6371 * acos(cos(radians(:targetLat)) * cos(radians(cp.x_coord)) * cos(radians(cp.y_coord) - radians(:targetLong)) + sin(radians(:targetLat)) * sin(radians(cp.x_coord))))
//        double a = 0.027492088687312777;
//        double b = 0.01968185262851406;
        List<Integer> a = new ArrayList<>(List.of(8, 4, 6, 3, 9, 6, 1, 5, 6, 34, 56, 23));

//        List<Integer> d = new ArrayList<>();
//        d.add(a);

        Collections.sort(a);
        System.out.println(a);

        double distance = (6371 * Math.acos(Math.cos(Math.toRadians(0.302550)) * Math.cos(Math.toRadians(0.302691)) * Math.cos(Math.toRadians(0.303257) - Math.toRadians(0.303150)) + Math.sin(Math.toRadians(0.302550)) * Math.sin(Math.toRadians(0.302691))));
//        System.out.println(distance);
    }
}
