public class Reverse {
    public static void main(String[] args) {
        String str = "World";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse().toString();
        System.out.println(sb);
    }
}
