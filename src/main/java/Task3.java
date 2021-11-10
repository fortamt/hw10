import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] str = {"1, 2, 0", "4, 5"};

        List<String> numbers = Arrays.stream(str)
                .flatMap((p) -> Arrays.asList(p.split(", ")).stream())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numbers);




    }
}
