
import java.util.*;

public class DirReduction {
    public static void main(String[] args) {
//        String[] arr = {"NORTH", "EAST", "NORTH", "EAST", "WEST", "WEST", "EAST", "EAST", "WEST", "SOUTH"};
//        String[] arr = {"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"};
        String[] arr = {"EAST", "NORTH", "SOUTH", "EAST", "EAST", "SOUTH", "WEST", "SOUTH", "WEST", "NORTH"};

        System.out.println(Arrays.toString(dirReduc(arr)));


    }

    public static String[] dirReduc(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);

//        ====CARA KE 2==========
//        if(arr.length == 0 || arr.length <= 1) {
//            return arr;
//        }
//
//        for(int i=0; i < arr.length - 1; i++) {
//            if(
//                    ("NORTH".equals(arr[i])) && ("SOUTH".equals(arr[i+1])) ||
//                    ("SOUTH".equals(arr[i])) && ("NORTH".equals(arr[i+1])) ||
//                    ("EAST".equals(arr[i])) && ("WEST".equals(arr[i+1])) ||
//                    ("WEST".equals(arr[i])) && ("EAST".equals(arr[i+1]))
//            ) {
//                arr[i] = null;
//                arr[i+1] = null;
//            }
//        }
//
//        String[] newArr = Arrays.stream(arr).filter(i -> i != null).toArray(String[]::new);
//
//        if(newArr.length == arr.length) {
//            return arr;
//        } else {
//            return dirReduc(newArr);
//        }

    }


}
