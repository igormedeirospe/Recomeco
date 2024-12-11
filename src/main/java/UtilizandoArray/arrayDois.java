package UtilizandoArray;

public class arrayDois {
  public static void main(String[] args) {
    //criando lista de animais e array utilizando laço for

    String[] Animais = new String[4];
    Animais[0] = "Ratao";
    Animais[1] = "Tubarao";
    Animais[2] = "Leao";
    Animais[3] = "Cachorro";

    for (int posicao = 0 ; posicao <4; posicao++ ){
      System.out.println("Posição: " + posicao + " Animal: " + Animais[posicao]);
    }

  }
}
