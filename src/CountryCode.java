import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountryCode {
    public static void main(String[] args) {

        Locale.getISOCountries(Locale.IsoCountryCode.PART1_ALPHA2).stream().filter(i -> i.equals("CM"));
//        System.out.println(new ArrayList<>(cm));

    }
}
