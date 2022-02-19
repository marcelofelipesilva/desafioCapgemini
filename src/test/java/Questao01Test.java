import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class Questao01Test {

    @Test
    void escadaMetodoTest() {

        int numero = 6 ;
        LinkedList<String> palavra = new LinkedList<String>();
        LinkedList<String> resultadoEsperado = new LinkedList<>();

        for (int i = 0; i < numero; i++) {
            palavra.addFirst(" ");
        }

        for (int i = 0; i < numero; i++) {
            palavra.addLast("*");
            palavra.removeFirst();

            for (String p : palavra) {
                resultadoEsperado.add(p);
            }
        }

        LinkedList<String> resultado = Questao01.escada(numero);


        Assertions.assertEquals(resultadoEsperado,resultado);
    }
}