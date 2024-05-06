public class Fibonacci {
    public static void printFibonacci(int val_1, int val_2, int num){
        //Base Case
        if(num == 0)
            return;

        //Printing the next Fibonacci number
        System.out.print( val_1 + val_2 + " ");

        //Recursively calling for printing Fibonacci for remaining length
        printFibonacci(val_2, val_1+val_2, --num);
        System.out.println();
        System.out.println(num);
    }

    public static void main(String[] args) {
        System.out.print("0 1 ");
        printFibonacci(0,1,10);

    }
}
