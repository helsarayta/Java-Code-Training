import java.util.Arrays;

public class WhoLikesIt {
    public static void main(String[] args) {
        String[] names = {"Peter","Heydie", "Helsa", "Alva","varo"};

        if(names.length == 0) {
            System.out.println("no one likes this");
        } else if (names.length == 1){
            System.out.println(String.format("%s likes this",names[0]));
        } else if (names.length == 2) {
            System.out.println(String.format("%s and %s like this", names[0], names[1]));
        } else if (names.length == 3) {
            System.out.println(String.format("%s, %s and %s like this", names[0], names[1],names[2]));
        } else {
            System.out.println(String.format("%s, %s and %s others like this", names[0], names[1], names.length - 2));
        }

    }
}
