package com.platzi.functional._07_inference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Inferencia {

    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora = integer -> "Al doble:" + integer*2;

        List<String> alumni = getList( "Andres", "Roland", "Erminio" );
        alumni.forEach( (String name) -> System.out.println(name) );
        alumni.forEach( (name) -> System.out.println(name) );
        alumni.forEach( System.out::println);
    }


    static <T> List<T> getList(T... elements) {

        return Arrays.asList(elements);
    }
}
