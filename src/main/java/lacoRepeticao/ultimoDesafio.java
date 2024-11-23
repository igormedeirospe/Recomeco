package lacoRepeticao;
import java.util.Scanner;
public class ultimoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String candidato1, candidato2,candidato3;
        int votosCandidato1, votosCandidato2,votosCandidato3;
        int votacao, totalVotos, maiorVotacao;
        votosCandidato1=0;votosCandidato2 =0;votosCandidato3 = 0;

        System.out.println("nome candidato 1: ");
        candidato1 = scanner.nextLine();

        System.out.println("nome candidato 2: ");
        candidato2 = scanner.nextLine();

        System.out.println("nome candidato 3: ");
        candidato3 = scanner.nextLine();

        totalVotos = 0;

        do {
            System.out.println("Digite o numero do seu candidato (aperte 0 para finalizar o programa): ");
            votacao = scanner.nextInt();
            switch (votacao){
                case 1:{
                    votosCandidato1++;
                    totalVotos++;
                    break;
                }
                case 2:{
                    votosCandidato2++;
                    totalVotos++;
                    break;
                }
                case 3:{
                    votosCandidato3++;
                    totalVotos++;
                    break;
                }
                default:
                    if (votacao !=0){
                        System.out.println("Voto invalido");
                    }
            }
        }while (votacao != 0);
        System.out.println("Candidato 1: " + candidato1 + " teve o total de votos de: " + votosCandidato1);
        System.out.println("Candidato 2: " + candidato2 + " teve o total de votos de: " + votosCandidato2);
        System.out.println("Candidato 3: " + candidato3 + " teve o total de votos de: " + votosCandidato3);
        System.out.println("total de votos = " + totalVotos);

    }
}
