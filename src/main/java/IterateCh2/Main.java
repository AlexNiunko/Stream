package IterateCh2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.concat(Stream.of(1,5,4),
                      Stream.of(4,6,7))
    .forEach(System.out::println);
    }
}
