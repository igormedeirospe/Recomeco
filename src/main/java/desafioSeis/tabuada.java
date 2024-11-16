package desafioSeis;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        java.util.Scanner lendoNumDigitado = new Scanner(System.in);
        System.out.println("digite o numero:");
        int numeroDigitado = lendoNumDigitado.nextInt();
        for (int n = 1; n < 11; n++){
                System.out.println(numeroDigitado + "x" + n + "="+ (numeroDigitado*n));
        }
    }
}
