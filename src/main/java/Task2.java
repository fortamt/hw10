import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Artem");
        names.add("Ekaterina");
        names.add("Vyacheslav");
        names.add("Filipp");
        names.add("Nikolay");
        names.add("Kristina");
        names.add("Petr");
        names.add("Andrey");


        System.out.println(sort(names));

    }

    public static List<String> sort(List<String> names){
        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted( (a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        return result;
    }

}
