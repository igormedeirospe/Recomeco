package recomeco;
import java.util.Scanner;
import javax.swing.JOptionPane;
//utilizando classe aluno

public class ScannerNome {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Bem vindo ao meu sistema");
        String genero = JOptionPane.showInputDialog("Digite seu genero");
        JOptionPane.showMessageDialog(null,genero);
        java.util.Scanner objetoNome = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        int resposta = JOptionPane.showConfirmDialog(null,"matheus é estudante??");
        if (resposta ==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"matheus é  estudante");
        }else {
            JOptionPane.showMessageDialog(null,"matheus não é estudante ");
        }


        String nome = objetoNome.nextLine();
        aluno aluno1 = new aluno(888555444,6);
        aluno1.setCpf(40038933);
        System.out.println("aluno 1 de nome : " + nome + " de cpf: " + aluno1.getCpf() + " e série " + aluno1.getAno() + " ano");


        for (int n =1; n < 4; n++){
            System.out.println("matheus estudou essa quantia de periodos " + n);
        }
        java.util.Scanner objetoIdade = new Scanner(System.in);
        System.out.print("digite sua idade: ");
        int idade = objetoIdade.nextInt();
        if (idade < 18){
        System.out.println("sua idade não é compativel com a regra do cadastro");
        }else{
            System.out.println("sua idade corresponde sim ao cadastro parábens!");
        }

        java.util.Scanner objetoNota = new Scanner(System.in);
        System.out.println("digite sua nota 1");
        double nota1 = objetoNota.nextDouble();
        System.out.println("digite sua nota 2");
        double nota2 = objetoNota.nextDouble();
        System.out.println("digite sua nota 3");
        double nota3 = objetoNota.nextDouble();
        System.out.println("digite sua nota 4");
        double nota4 = objetoNota.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4 ) /4;
        if (media >=7){
            System.out.println("aprovado: " + media);
        }else if (media >=2){
            System.out.println("Recuperação" + media);
        }else{
           System.out.println("Reprovado: " + media );
        }


        if (nome.equals("igor") || nome.equals("matheus")){
            System.out.println("parábens pelo seu esforço <3");
        }





    }

}
////