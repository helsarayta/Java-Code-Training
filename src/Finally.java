public class Finally {
    public static void main(String[] args) {


        try {
            int variable = 5;
        }
        catch (Exception exception) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Execution of finally block");
        }
    }
}
