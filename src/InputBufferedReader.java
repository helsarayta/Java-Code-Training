import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class InputBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = BigInteger.valueOf(Long.parseLong(reader.readLine()));
        BigInteger b = BigInteger.valueOf(Long.parseLong(reader.readLine()));

        System.out.println(a.add(b));
    }
}
