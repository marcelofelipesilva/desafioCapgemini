import java.util.Scanner;

public class Questao02 {


  public static int testeTamanhoSenha(String senha)
  {
      int numero = 0;
      if (senha.length() < 6){
          numero = 6 - senha.length();
          System.out.println(numero);
      }
      return numero;
  }


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String senha = leitor.nextLine();
        Questao02  questao02 = new Questao02();
        questao02.testeTamanhoSenha(senha);



    }
}
