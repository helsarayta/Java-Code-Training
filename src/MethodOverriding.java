public class MethodOverriding  {
    public int methodA(int a) {
        return a;
    }

    final int methodB(int b) {
        return b;
    }
}

class SecondOveriding extends MethodOverriding {
    @Override
    public int methodA(int a) {
        return a+1;
    }


}

final class finalTestClass {

}
