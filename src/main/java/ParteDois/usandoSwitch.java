package ParteDois;

import javax.swing.*;

public class usandoSwitch {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da semana: "));
        switch (dia){
            case 1:
                JOptionPane.showMessageDialog(null,"segunda");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"terça");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"quarta");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"quinta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"sexta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"domingo");
                break;

            default: {
                System.out.println("voce não digitou um dia");
            }
        }



    }
}
