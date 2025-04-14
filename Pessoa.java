public class Pessoa {
    private int cpf;
    private int dia;
    private int mes;
    private int ano;

    // PESSOA
    public Pessoa (int cpf, int dia, int mes, int ano){
        this.cpf = cpf;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void exibirNascimento() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public int getcpf() {
        return cpf;
    }

    public int getdia() {
        return dia;
    }

    public int getmes() {
        return mes;
    }

    public int getano() {
        return ano;
    }

    public void setcpf(int cpf) {
        this.cpf = cpf;
    }

    public void setdia(int dia) {
        this.dia = dia;
    }

    public void setmes(int mes) {
        this.mes = mes;
    }

    public void setano(int ano) {
        this.ano = ano;
    }

}
