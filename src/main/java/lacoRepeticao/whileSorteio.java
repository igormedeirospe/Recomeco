package lacoRepeticao;
import java.util.Scanner;
import java.util.Random;
public class whileSorteio {
    public static void main(String[] args) {
        /*
        sistema de sorteio de números utilizando laço while que faça o sorteio de um número de 0 a 100 e permita o usuario acertar o número que foi sorteado
        Se o usuário não acertar, deve imprimir uma mensagem informando se o número sorteado é maior ou menor que a tentativa feita
        quando o usuário acertar exibir o total de tentativas feitas
        */
        Random random = new Random();
        int numeroRandom = random.nextInt(100) +1;
        System.out.println(numeroRandom);
        Scanner NumDigitado = new Scanner(System.in);
        System.out.println("Tente adivinhar o número entre 1 e 100!");
        System.out.println("Digite seu palpite:");
        int tentativa = NumDigitado.nextInt();
        int tentativasFeitas = 0;
        while (tentativa != numeroRandom){
            if (tentativa < numeroRandom) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Muito alto! Tente novamente.");
            }
            tentativasFeitas++;
            // Solicita outro palpite dentro do laço
            System.out.print("Digite seu palpite: ");
            tentativa = NumDigitado.nextInt();

        } // Verifica se o palpite está correto
        System.out.println("Parabéns! Você adivinhou o número: " + numeroRandom + " mas utilizou " + tentativasFeitas +" tentativas");

        NumDigitado.close();



        

    }
}
