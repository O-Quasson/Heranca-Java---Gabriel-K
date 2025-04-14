public class Funcionarios extends Pessoa {
    private String nome; 
    private Double salario;
    private String departamento;
    
    // //FUNCIONARIO
    public Funcionarios (String nome, Double salario, String departamento){
    this.nome = nome;
    this.salario = salario;
    this.departamento = departamento;
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
