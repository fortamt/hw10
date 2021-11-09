import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Deque<T> firstDeque = new ArrayDeque<>();
        Deque<T> secondDeque = new ArrayDeque<>();
        List<T> resultList = new ArrayList<>();
        while(!firstDeque.isEmpty() && !secondDeque.isEmpty()){
            firstDeque.pollFirst();
            secondDeque.pollFirst();
        }
        return resultList.stream();
    }
}
