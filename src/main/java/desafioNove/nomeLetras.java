package desafioNove;

import java.util.Scanner;

public class nomeLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vogal = 0;
        int consoante = 0;

        for (int i = 1; i <= 3; i++){
            System.out.println("digite seu nome "+ i + " :");
            String nome = scanner.nextLine();

            // Converte a primeira letra para minúscula e verifica se é uma vogal
            char primeiraLetra = Character.toLowerCase(nome.charAt(0));
            if (primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o' || primeiraLetra == 'u'){
                vogal++;
            }else {
                consoante++;
            }
        }

        System.out.println("Total de nomes que comecam com vogais: "+ vogal);
        System.out.println("Total de nomes que comecam com consoantes: "+ consoante);
    }
}
