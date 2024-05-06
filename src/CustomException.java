class CustomException  {

    public static void main(String[] args) throws ExampleCustomException {

        throw new ExampleCustomException("Exception executed");
    }

}

class ExampleCustomException extends Exception {
    ExampleCustomException(String message) {
        super(message);
    }
}
