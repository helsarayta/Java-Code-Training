public class PinDigitNumber {
    public static void main(String[] args) {
        String pin = "23";

        pin.matches("\\d{4}|\\d{6}"); //simple
        boolean b = pin.matches("[0-9]+") && ((pin.length() == 4) || (pin.length() == 6)) ? true : false;

        System.out.println(b);
    }
}
