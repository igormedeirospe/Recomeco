package doisKVinteCinco;

public class Celular {

  String cor;
  String marca;
  String modelo;
  double valor;

  //sera criado 3 construtores diferentes para 3 modelos diferentes

  //construtor 0 parametros
  public Celular(){

  }

  //construtor com apenas 2 parametros
  public Celular(String modelo, String marca){
    this.modelo = modelo;
    this.marca = marca;
  }
  //construtor com apenas 4 parametros
  public Celular(String modelo,String marca, String cor, double valor){
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.valor = valor;
  }

}
