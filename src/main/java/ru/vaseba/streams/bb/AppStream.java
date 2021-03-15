package ru.vaseba.streams.bb;

import java.util.stream.Stream;

public class AppStream {

    public static void main(String[] args) {

        Stream.of(3, 4, 7, 12, 6, 18, 22)
                .skip(3).
                forEach(System.out::println);

        System.out.println();
        System.out.println("----------------");

        Stream.of(3, 4, 7, 12, 6, 18, 22)
                .distinct().
                forEach(System.out::println);

        System.out.println();
        System.out.println("----------------");

        Stream.of(3, 4, 7, 12, 6, 18, 22)
                .sorted().
                forEach(System.out::println);

        System.out.println();
        System.out.println("----------------");


    }
}
