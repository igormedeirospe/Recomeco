package desafioCinco;

import javax.swing.*;

public class lerNotas {
    public static void main(String[] args) {
        String aluno;
        float nota1, nota2,media, somaNotas, mediaSala;
        somaNotas =0;

        for (int cont = 1; cont <=3; cont++ ){
        aluno = JOptionPane.showInputDialog("Digite seu nome: ");
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(""));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(""));
        media = (nota1 + nota2) /2;
        somaNotas = somaNotas + media;

        System.out.println("Aluno(A): " + aluno);
        System.out.println("media: " + media);

        if (media >= 6){
            System.out.println("Aluno(A): Aprovado " );
        }else {
            System.out.println("Aluno(A): Reprovado ");
        };

        }
        mediaSala = somaNotas /3;
        System.out.println("media turma: " + mediaSala);


    }
}
