public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(8));
    }

    public static boolean isPrime (int number) {

        for(int i = 2; i < number; i++) {
//            if((number / i) == )
            System.out.println(number/i);
        }

        if(number % number == 0) {
            return true;
        } else {
            return false;
        }
    }
}
