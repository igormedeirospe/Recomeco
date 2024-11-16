package lacoRepeticao;
import java.util.Scanner;
public class useWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome  ou B para sair");
        nome = entrada.nextLine();
        while (!nome.equals("B")){
            System.out.println("Bem vindo: "+ nome);
            System.out.println("Digite seu nome novamente ou B para sair do Loop");
            nome = entrada.nextLine();
        }
        System.out.println("Fim da execução");

    }
}
