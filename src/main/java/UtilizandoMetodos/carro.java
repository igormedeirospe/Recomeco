package UtilizandoMetodos;

public class carro {

  private int anoDoCarro;
  private String modelo;

  //metodo construtor
  public carro(int anoDoCarro, String modelo){
    this.anoDoCarro = anoDoCarro;
    this.modelo = modelo;
  }

  //metodo get e set

  public void setAnoDoCarro(int anoDoCarro){
    this.anoDoCarro = anoDoCarro;
  }

  public int getAnoDoCarro(){
    return anoDoCarro;
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public String getModelo(){
    return modelo;
  }
}
