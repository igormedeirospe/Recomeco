package lacoRepeticao;
import java.util.Scanner;
public class whileMaiorMenor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero inteiro positivo (digite um numero negativo para sair do loop)");
    int numerosInteiroDigitado , menor, maior;
        numerosInteiroDigitado = scanner.nextInt();
        maior = numerosInteiroDigitado;
        menor = numerosInteiroDigitado;
    while (true){
        System.out.println(numerosInteiroDigitado);
        numerosInteiroDigitado = scanner.nextInt();
        //laço if para interromper o laço caso digite um número < 0
        if (numerosInteiroDigitado < 0){
            System.out.println("Voce saiu do laço");
            break;
        }

        if (numerosInteiroDigitado > maior){
            maior = numerosInteiroDigitado;
        }
        if (numerosInteiroDigitado < menor ){
            menor = numerosInteiroDigitado;
        }
    }
        System.out.println("maior numero digitado: " + maior);
        System.out.println("menor numero digitado: " + menor);

    }
}
