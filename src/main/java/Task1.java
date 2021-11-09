import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
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

        System.out.println(sorted(names));
    }

    public static String sorted(List<String> names){
        String result = names.stream()
                .filter(el -> names.indexOf(el)%2 != 0)
                .map(el -> names.indexOf(el)+ ". " + el)
                .collect(Collectors.joining(", "));
        return result;
    }



}