package desafioOito;

import java.util.Scanner;
//fazer depois
public class desafioFatorial {
    public static void main(String[] args) {
        java.util.Scanner lerNumeroInteiro = new Scanner(System.in);
        int numero, fatorial;
        numero = lerNumeroInteiro.nextInt();
        fatorial = 1;
        for (int contador = numero; contador >= 1; contador--){
            fatorial = fatorial * contador;
            System.out.println(fatorial);

        }
        System.out.println("o fatorial do: " + numero + " : " + fatorial);




    }
}
