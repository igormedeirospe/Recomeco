package desafioQuatro;
import java.util.Scanner;
public class DesafioSenha {
    public static void main(String[] args) {
    java.util.Scanner leituraNome = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String nome = leituraNome.nextLine();
    System.out.println("Digite sua senha: ");// senha tem que ser == 123;
    int senha = leituraNome.nextInt();
    if (senha == 123){
        System.out.println("Sr "+ nome + " sua senha está correta");
    }else{
        System.out.println("cliente "+ nome + " sua senha Invalida");
    }

    }
}
//