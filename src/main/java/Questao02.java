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

  public static boolean testeSenhaForte(String senha){
      String regex = "^(?=.*[0-9])"
              + "(?=.*[a-z])(?=.*[A-Z])"
              + "(?=.*[@#$%^&+=])"
              + "(?=\\S+$).{6,20}$";

      if (senha.matches(regex)){
          System.out.println("Senha Forte!");
      }else { System.out.println("Senha Fraca!");}
      return senha.matches(regex);
  }


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String senha = leitor.nextLine();

       testeTamanhoSenha(senha);

       testeSenhaForte(senha);





    }
}
