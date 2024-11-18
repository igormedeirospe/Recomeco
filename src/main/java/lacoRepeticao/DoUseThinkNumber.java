package lacoRepeticao;
import java.util.Scanner;
public class DoUseThinkNumber {
    public static void main(String[] args) {
        /*
        Solicite ao usuario a entrada de N números e só encerre o programa quando o usuário
        digitar um número entre 1 e 5
         */
          Scanner scanner = new Scanner(System.in);
          int numero;
          do {
              System.out.println("Digite um numero inteiro mas o programa irá encerrar se o número estiver entre 1 e 5");
              numero = scanner.nextInt();
              if (numero < 1 || numero >5){
                  System.out.println("seu numero é: " + numero + " se quiser sair do laço é so utilizar um numero entre 1 e 5! ");
              }
          }while (numero < 1 || numero >5);


          System.out.println("o numero esta entre 1 e 5: " + numero);
          scanner.close();
    }
}
