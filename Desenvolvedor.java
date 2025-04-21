public class Desenvolvedor extends Funcionarios{

    //super(getano,getcpf,getdepartamento,getdia,getmes,getnome,getsalario);
    
    public Desenvolvedor (String nome, String sobrenome, Double salario, String departamento, String cpf, int dia, int mes, int ano,int tipo){
        super(nome, sobrenome, salario, departamento, cpf, dia, mes, ano, tipo); 
    }

    void programar(Funcionarios funcionarios){
        System.out.println(funcionarios.getnome() + " está programando!");
    }

    //deu erro, perguntar pro leo dps
    @Override
    void mostrarDados (Funcionarios funcionarios){
        // System.out.println("Nome: " + desenvolvedor.getnome());
        // System.out.println("Data de nascimento: " + desenvolvedor.getdia() + "/" + desenvolvedor.getmes() + "/" + desenvolvedor.getano());
        // System.out.println("Salário: " + desenvolvedor.getsalario());
        // System.out.println("Departamento: " + desenvolvedor.getdepartamento());
        // System.out.println("Posição na empresa: desenvolvedor");
        super.mostrarDados(funcionarios);
        System.out.println("Posição na empresa: desenvolvedor");

    }
}
