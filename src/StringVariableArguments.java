import java.util.Arrays;

public class StringVariableArguments {
    static int i;
    static String a;
//    public static void varArgs(String... name) {
//        System.out.println(Arrays.toString(name));
//    }

    public static void main(String[] args) {
//        varArgs("Heydie","Sari","Helsa");
        value();
        System.out.println("TEST");
    }

    public StringVariableArguments() {
        System.out.println("Contructor");
    }

    public static void value() {
        System.out.println(i);
        System.out.println(a);
    }

}
