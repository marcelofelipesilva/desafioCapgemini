import java.util.LinkedList;
import java.util.Scanner;

public class Questao01 {

    public String escada(int n){

        // adicionando variáveis
        LinkedList<String> palavra = new LinkedList<String>();
        String resultado="";

        // adicinando espaços
        for (int i = 0; i < n; i++) {
            palavra.addFirst(" ");
        }

        //iteração com a lista
        for (int i = 0; i < n; i++) {
            palavra.addLast("*");
            palavra.removeFirst();

            for (String p : palavra) {
                resultado+=p;
                System.out.print(p);
            }
            resultado+="\n";
            System.out.println();
        }

        return resultado;
    }

    public static void main(String[] args) {

        // adicionando variáveis
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        Questao01 questao01 = new Questao01();
        questao01.escada(n);

    }


}
