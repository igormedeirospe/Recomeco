package lacoRepeticao;
import java.util.Scanner;

public class ValidandoSenha {
    /*  // Objetivo \\
    Peça ao usuário para digitar uma senha.
    Valide se a senha é igual a "1234".
    Caso a senha esteja incorreta, exiba uma mensagem como "Senha inválida! Tente novamente." e peça para o usuário digitar novamente.
    Continue pedindo até que o usuário acerte a senha.
    Quando a senha estiver correta, exiba a mensagem "Acesso permitido." e encerre o programa.
    Requisitos:
    Utilize o laço do-while.
    Use a classe Scanner para receber a entrada do usuário.
    A validação deve acontecer após o primeiro pedido de senha (garantindo que o bloco do "do" execute pelo menos uma vez).
    */
    public static void main(String[] args) {
    //System.out.println("Digite a sua senha : ");//exibir mensagem pedindo a senha que tem que ser "1234"
    Scanner leuSenha = new Scanner(System.in);
    int senha;
    do {
        System.out.println("Digite a senha");
        senha = leuSenha.nextInt();if (senha != 1234) {
            System.out.println("Senha inválida! Tente novamente.");
        }
    }while (senha != 1234);
    System.out.println("parabens senha certa pae");
    leuSenha.close();
    }
}