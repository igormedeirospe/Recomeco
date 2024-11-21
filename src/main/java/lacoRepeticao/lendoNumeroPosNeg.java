package lacoRepeticao;
import java.util.Scanner;
public class lendoNumeroPosNeg {
    public static void main(String[] args) {
    //solicitar ao usuario a entrada de N números
    Scanner scanner = new Scanner(System.in);
    int numero;
    do {
        System.out.println("Digite um numero inteiro mas o programa irá encerrar se digitar número 0");
        numero = scanner.nextInt();
        if (numero > 0){
            System.out.println("Numero positivo = "+ numero);
        }else {
            System.out.println("Numero negativo = "+ numero);
        }
    }while (numero != 0);
    System.out.println("finalizado");

    scanner.close();
    }
}
