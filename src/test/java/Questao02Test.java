import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Questao02Test {

    @Test
    void testeTamanhoSenha() {
        String senha = "Ya3";
        int resultadoEsperado = 6 - senha.length();
        int resultadoAtual = Questao02.testeTamanhoSenha("Ya3");

        Assertions.assertEquals(resultadoEsperado,resultadoAtual);

    }
}