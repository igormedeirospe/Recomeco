package desafioUm;

import javax.swing.*;

public class desafioImpar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero inteiro"));
        if (numero % 2 == 0){
            System.out.println("numero " + numero + " PAR");
        }else {
            System.out.println("numero "+ numero + " ÍMPAR");
        }







    }
}
//