public class SwicthValueVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Cara ke 1
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;

        //Cara ke 2
        a = a + b; //15
        b = a - b; //10
        a = a - b; //5

        System.out.println(a);
        System.out.println(b);
    }
}
