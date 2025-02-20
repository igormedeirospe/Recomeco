package lacoRepeticao;

public class utilizandoFor {
  public static void main(String[] args) {

    int[] numeros = {10, 20, 30, 40, 50};

    String[] AlunosMatric = new String[10];
    AlunosMatric[0] = "Igor";
    AlunosMatric[1] = "Brener";
    AlunosMatric[2] = "Matheus";
    AlunosMatric[3] = "Ariana";
    AlunosMatric[4] = "Ana";
    AlunosMatric[5] = "sla";

    int indice = 0;
    for (int num :numeros){
      System.out.println("numero da lenght:"+ indice +" valor: "+num);
      indice++;
    }

    for (int i=0; AlunosMatric.length > i ; i++){
      System.out.println("alunos são: "+ i+":"+ AlunosMatric[i]);
    }



  }
}
