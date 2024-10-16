package recomeco;

public class aluno {

    private int cpf;
    private int ano;

    public aluno(int cpf, int ano){
        this.cpf=cpf;
        this.ano=ano;
    }

    //metodo get e set
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
//