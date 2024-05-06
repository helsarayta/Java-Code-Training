public class OppositeNumber {
    public static void main(String[] args) {
        int number = 1;
//        System.out.println(number*-1);
        int i = String.valueOf(number).contains("-") ? number * -1 : -number;
        System.out.println(i);
    }
}
