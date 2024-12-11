package UtilizandoMetodos;

public class utilizando {
  public static void main(String[] args) {

    carro meuCarro = new carro(2009, "Civic");
    carro carro1 = new carro(2001,"celta");
    System.out.println("atual carro1 " +carro1.getModelo() + " / " + carro1.getAnoDoCarro());

    carro1.setAnoDoCarro(2007);
    carro1.setModelo("Civic si");
    System.out.println("Carro atual atualizado= "+ carro1.getModelo() + " / " + carro1.getAnoDoCarro());
    String nomePessoa1 = "Igor Medeiros";
    System.out.println("A pessoa " + nomePessoa1 + " tem um carro mas o carro dele(a) é um: " + meuCarro.getModelo());

  }
}
