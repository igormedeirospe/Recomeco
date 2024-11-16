package lacoRepeticao;
import java.util.Scanner;
public class usandoDeNovo {
    public static void main(String[] args) {
        //receber valor inteiro e mostrar na tela se é impar ou pá e quando digitar um número negativo < 0 sair do loop
        Scanner receberValor = new Scanner(System.in);
        System.out.println("Digite um numero inteiro (ou um número negativo para interromper o laço");
        int numero;
        while (true){
            numero = receberValor.nextInt();
            if (numero < 0){
                System.out.println("Voce saiu do laço");
                break;
            }
            if (numero % 2 == 0){
                System.out.println("numero: " + numero + " é PAR");
            }else {
                System.out.println("numero: "+ numero + " é ÍMPAR");
            }
        }
    }
}
