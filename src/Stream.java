import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> list = List.of("Heydie","Sari","Helsa","Hafsya");

        List<String> ps = list.parallelStream().filter(l -> l.startsWith("H")).collect(Collectors.toList());

        List<String> collect = list.stream().filter(i -> i.length() > 4).collect(Collectors.toList());
        List<String> strings = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(ps);
    }
}
