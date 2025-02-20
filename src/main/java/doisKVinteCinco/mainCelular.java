package doisKVinteCinco;

public class mainCelular {
  public static void main(String[] args) {
    //essa classe vai exibir e instanciar a classe celular ( vou criar 3 celulares)
    Celular celular1 = new Celular();
    System.out.println("modelo: " + celular1.modelo +" marca: " + celular1.valor);
    Celular celular2 = new Celular("iphone 12","apple");
    System.out.println("o celular 2 tem o modelo: " + celular2.modelo + " e sua marca é: " + celular2.marca);
    Celular celular3 = new Celular("iphone 15","apple","dourado", 3000);
    System.out.println("o celular 3 tem o modelo: " + celular3.modelo + " e sua marca é: " + celular2.marca + " cor: " + celular3.cor + " valor: " + celular3.valor);

  }
}
