package com.platzi.functional._04_functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text +"\"";
        UnaryOperator<String> addMark = text -> text +"!";
        System.out.println(addMark.apply(quote.apply("Hola")));
        BiFunction<String, Integer, String> multiplicacion = (y,x) -> String.format( "%" + x + "s", y );

        System.out.println(multiplicacion.apply( "java", 10 ));

        List<BiFunction<String, Integer, String>> formateadores;

    }
}
