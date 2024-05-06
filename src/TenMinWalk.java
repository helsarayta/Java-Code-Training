import java.util.Arrays;

public class TenMinWalk {
    public static void main(String[] args) {
        char[] walk = {'e', 'e', 'e', 'e', 'e', 'w', 'w', 'n', 'w', 'w'};

        System.out.println(isValid(walk));
    }

    public static boolean isValid(char[] walk) {
        int ns = 0;
        int ew = 0;

        if (walk.length == 10) {
            for (char i : walk) {
                if (i == 'n') ns += 1;
                if (i == 's') ns -= 1;
                if (i == 'e') ew += 1;
                if (i == 'w') ew -= 1;
            }
            return (ns == 0 && ew == 0);
        } else {
            return false;
        }
    }
}
