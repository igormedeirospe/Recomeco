package desafioDois;
import java.util.Scanner;
public class DesafioDif {

    public static void main(String[] args) {

        java.util.Scanner lerNum = new Scanner(System.in);
        //ler Num1
        System.out.println("Digite o Primeiro número");
        int num1 = lerNum.nextInt();
        //ler Num2
        System.out.println("Digite o Segundo número");
        int num2 = lerNum.nextInt();


        if (num1 > num2){
            System.out.println("a diferença do numero 1 que é: " + num1 + " para o numero 2 que é: " + num2 + " e de: " + (num1 - num2));

        } else if (num2 > num1) {
            System.out.println("a diferença do numero 2 que é: " + num2 + " para o numero 1 que é: " + num1 + " e de: " + (num2 - num1));
        }else {
            System.out.println("os numeros são iguais com a diferença: 0");
        }



    }

}
//