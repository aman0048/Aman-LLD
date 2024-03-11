package multiThreading.javaPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ComparatorExample> list = new ArrayList<>();
        list.add(new ComparatorExample("aman", 12));
        list.add(new ComparatorExample("sager", 24));
        list.add(new ComparatorExample("sahil", 12));
        list.add(new ComparatorExample("pranav", 14));

        Collections.sort(list, (a, b) -> a.getAge() - b.getAge());
        Collections.sort(list, Comparator.comparing(ComparatorExample::getAge));

        list.forEach(System.out::println);
    }
}
