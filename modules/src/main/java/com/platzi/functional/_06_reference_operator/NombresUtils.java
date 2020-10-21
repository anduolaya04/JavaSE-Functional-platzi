package com.platzi.functional._06_reference_operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {


    private static List<String> list;

    public static void main(String[] args) {
        List<String> profesores = getList( "Andres", "Lulu", "Jorge" );
        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);
        /////
        profesores.forEach(NombresUtils::saveInList);
    }

    static <T> List<T> getList(T... elements) {

        return Arrays.asList(elements);
    }

     static void saveInList(String text){

        list = new ArrayList<>();
        list.add( text );
    }
}
