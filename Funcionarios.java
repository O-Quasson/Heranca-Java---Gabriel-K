public class Funcionarios extends Pessoa {
    private String nome; 
    private Double salario;
    private String departamento;
    
    // //FUNCIONARIO
    public Funcionarios (String nome, Double salario, String departamento, String cpf, int dia, int mes, int ano){
    super(cpf, dia, mes, ano);
    this.nome = nome;
    this.salario = salario;
    this.departamento = departamento;
    }

    void baterPonto(Funcionarios Funcionarios){
        System.out.println(Funcionarios.getnome() + " bateu o ponto e foi embora");
    }

    void mostrarDados (Funcionarios Funcionarios){
        System.out.println("Nome: " + Funcionarios.getnome());
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