package com.platzi.functional._07_inference;

import java.util.List;
import java.util.function.Function;

public class Inferencia {

    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora = integer -> "Al doble:" + integer*2;
    }

}
