import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {

}
class Test{
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


        List<String> names2 = new ArrayList<>();
        names2.add("John");
        names2.add("Itacha");
        names2.add("Dell");
        names2.add("MSI");
        names2.add("Jobs");
        names2.add("Steven");
        names2.add("Apple");
        names2.add("Samsung");
        Stream<String> namesTest= names.stream();
        Stream<String> namesTest2= names2.stream();

        Stream<String> test= zip(namesTest, namesTest2);
        names2 = test.collect(Collectors.toList());
        System.out.println(names2);
    }



    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();
        List<T> resultList = new ArrayList<>();

        for(int i = 0; firstList.size() > secondList.size() ? i < secondList.size() : i < firstList.size(); i++){
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }
        return resultList.stream();
    }
}
