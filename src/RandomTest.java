import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;

public class RandomTest {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("YYYYMM")));

        String name = "03-2023";
        System.out.println(name.replace("-","_"));

    }
}
