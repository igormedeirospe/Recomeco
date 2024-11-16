package desafioSete;

import java.util.Scanner;

public class lerNumerosImpar {
    public static void main(String[] args) {
        java.util.Scanner lerNumInt = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo");
        int numInt = lerNumInt.nextInt();
        System.out.println("os números abaixo sao impares");
        for (int i = 1; i <= numInt; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }


    }
}
