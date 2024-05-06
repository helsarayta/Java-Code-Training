public interface StaticVar {
    final String a = "Test";
    static final String b = "testB";


}

abstract class AbstractTest {
    final String a = "Test";
    static final Integer b = 6;

    String data = "Test";
    String non;


}

class TestApp extends AbstractTest {

}
