
import java.util.Locale;;

public class CountryCode {
    public static void main(String[] args) {

        Locale.getISOCountries(Locale.IsoCountryCode.PART1_ALPHA2).stream().filter(i -> i.equals("CM"));


    }
}
