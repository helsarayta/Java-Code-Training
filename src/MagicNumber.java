public class MagicNumber {

    public static void main(String[] args) {
        int num = 163;
        int sumOfDigits = 0;
        while (num > 0 || sumOfDigits > 9)
        {
            if (num == 0)
            {
                num = sumOfDigits;
                sumOfDigits = 0;
            }
            sumOfDigits += num % 10;
            System.out.println("1 : "+sumOfDigits);
            System.out.println("2 :"+num);
            num /= 10;
            System.out.println("3 : "+num);
        }

        // If sum is 1, original number is magic number
        if(sumOfDigits == 1) {
            System.out.println("Magic number");
        }else

        {
            System.out.println("Not magic number");
        }
    }
}
