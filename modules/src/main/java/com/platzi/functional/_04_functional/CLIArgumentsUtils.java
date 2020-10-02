package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    static void showHelp(CLIArguments cliArguments){
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if (cliArguments1.isHelp()){
                System.out.println("Manual solicitado");
            }
        };

        consumerHelper.accept( cliArguments );
    }

    static void printCuadratic(Integer x){

        Consumer<Integer> consumerCuadratic = y -> System.out.println(y*y);
        consumerCuadratic.accept( x );
    }

    static CLIArguments generateCLI(){
        Supplier<CLIArguments> generator = () -> new CLIArguments();

        return generator.get();
    }

    public static void main(String[] args) {
        CLIArguments cliArguments = new CLIArguments();

        cliArguments.setHelp( true );

        showHelp( cliArguments );

        printCuadratic( 5 );
    }
}
