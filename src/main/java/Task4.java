import java.util.List;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        long seed = 5L;
        long a = 25214903917L;
        int c = 11;
        long m = 281474976710656L;
        Stream<Long> stream = Stream.iterate(seed, i ->
                ((a * i) + c) % m);
        stream.forEach(System.out::println);



    }


}

