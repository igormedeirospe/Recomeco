package lacoRepeticao;
import java.util.Scanner;
public class contadorWhile {
    public static void main(String[] args) {

        Scanner Tsscanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo");
        int ContNumIntPos = Tsscanner.nextInt();
        ContNumIntPos = 0;
        int numImpar = 0;
        int numPar = 0;

        while (ContNumIntPos >= 0){
            System.out.println("Digite um numero inteiro positivo (ou um número negativo para sair): ");
            ContNumIntPos = Tsscanner.nextInt();
            if (ContNumIntPos >= 0){
                if ( ContNumIntPos % 2 == 0){
                    numPar++;
                }else {
                    numImpar++;
                }
            }

            System.out.println("quantatidade numero par: " + numPar);
            System.out.println("quantatidade numero par: " + numImpar);
        }


    }
}