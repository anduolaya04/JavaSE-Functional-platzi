package com.platzi.functional._10_chaining;

import java.text.StringCharacterIterator;

public class Chainiing {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder( );

        stringBuilder.append( "Hola" )
                .append( "soy" )
                .append( "un" )
                .append( "dev" );
        Chainer chainer = new Chainer();
        chainer.sayBye().sayHi();
    }

    static class Chainer {
        public Chainer sayHi(){
            System.out.println("Hola");
            return this;
        }

        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }
    }
}
