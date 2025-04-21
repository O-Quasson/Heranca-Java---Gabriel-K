public class Funcionarios extends Pessoa {
    private String nome; 
    String sobrenome;
    private Double salario;
    private String departamento;
    private int tipo;
    
    // //FUNCIONARIO
    public Funcionarios (String nome, String sobrenome, Double salario, String departamento, String cpf, int dia, int mes, int ano, int tipo){
        super(cpf, dia, mes, ano);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.departamento = departamento;
        this.tipo = tipo;
    }

    void baterPonto(Funcionarios Funcionarios){
        System.out.println(Funcionarios.getnome() + " bateu o ponto e foi embora");
    }

    void mostrarDados (Funcionarios Funcionarios){
        System.out.println("Nome: " + Funcionarios.getnome());
        System.out.println("Sobrenome: " + Funcionarios.getsobrenome());
        System.out.println("Data de nascimento: " + Funcionarios.getdia() + "/" + Funcionarios.getmes() + "/" + Funcionarios.getano());
        System.out.println("Salário: " + Funcionarios.getsalario());
        System.out.println("Departamento: " + Funcionarios.getdepartamento());
    }

    public String getnome (){
        return nome;
    }

    public Double getsalario (){
        return salario;
    }

    public String getdepartamento (){
        return departamento;
    }

    public int gettipo (){
        return tipo;
    }

    public String getsobrenome (){
        return sobrenome;
    }

    public void setsobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void settipo (int tipo){
        this.tipo = tipo;
    }

    public void setnome (String nome){
    this.nome = nome;
    }

    public void setsalario (Double salario){
    this.salario = salario;
    }

    public void setdepartamento (String departamento){
    this.departamento = departamento;
    }
}