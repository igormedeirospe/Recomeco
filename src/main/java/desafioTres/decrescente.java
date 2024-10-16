package desafioTres;
import java.util.Scanner;

public class decrescente {
    public static void main(String[] args) {
    java.util.Scanner lendoNum = new Scanner(System.in);
    System.out.println("digite o primeiro Numero");
    int numero1 = lendoNum.nextInt();
    System.out.println("digite o segundo Numero");
    int numero2 = lendoNum.nextInt();
    if (numero1 > numero2){
        System.out.println("numero maior: " + numero1 + "\nnumero menor: " + numero2);
    } else if (numero2 > numero1) {
        System.out.println("numero maior: " + numero2 + "\nnumero menor: " + numero1);
    }

    }
}
