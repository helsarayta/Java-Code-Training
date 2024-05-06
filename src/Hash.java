import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    public static void main(String[] args) {
        String password = "helsa";

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(password.getBytes());

            System.out.println(bytes);


        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
