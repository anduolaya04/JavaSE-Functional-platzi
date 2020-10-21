package com.platzi.functional._08_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = getList( "Java", "Functional" );

        cursos.forEach( curso -> System.out.println(curso) );

        usarZero( () -> 2 );

        usarPredicado( text -> text.isEmpty() );

        usarBifunction( (x,y) -> {
            System.out.println("X: "+ x + ", Y:" + y);
            return x - y;
        });

        usarNada( () -> {
            System.out.println("Hola");
        } );
    }

    static void usarNada(OperarNada operarNada){

    }

    static <T> List<T> getList(T... elements) {

        return Arrays.asList(elements);
    }

    static void usarZero(ZeroArgumentos zeroArgumentos) {

    }

    @FunctionalInterface
    interface ZeroArgumentos {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }

    static void usarPredicado(Predicate<String> predicado){

    }

    static void usarBifunction(BiFunction<Integer, Integer, Integer> operacion){

    }
}
