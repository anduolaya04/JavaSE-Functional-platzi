package com.platzi.functional._12_currying;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        List<String> names = getNames();

        if(names != null) {
            //Operar con nombres

        }
        Optional<List<String>> optionalNames = getOptionalNames();

        if (optionalNames.isPresent()){
        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
    }

    static List<String> getNames(){
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValuablePlayer(){
//  return "";
        return null;
    }

    static int mostExpensiveItem(){

        return -1;
    }

    static Optional<List<String>> getOptionalNames(){

        return Optional.of( new LinkedList<>() );
    }
}
