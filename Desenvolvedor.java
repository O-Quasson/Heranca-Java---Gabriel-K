public class Desenvolvedor extends Funcionarios{

    //super(getano,getcpf,getdepartamento,getdia,getmes,getnome,getsalario);
    
    public Desenvolvedor (String nome, Double salario, String departamento, String cpf, int dia, int mes, int ano){
        super(nome, salario, departamento, cpf, dia, mes, ano); 
    }

    void programar(Desenvolvedor desenvolvedor){
        System.out.println(desenvolvedor + " está programando!");
    }

    //deu erro, perguntar pro leo dps
    @Override
    void mostrarDados (Desenvolvedor desenvolvedor){
        // System.out.println("Nome: " + desenvolvedor.getnome());
        // System.out.println("Data de nascimento: " + desenvolvedor.getdia() + "/" + desenvolvedor.getmes() + "/" + desenvolvedor.getano());
        // System.out.println("Salário: " + desenvolvedor.getsalario());
        // System.out.println("Departamento: " + desenvolvedor.getdepartamento());
        // System.out.println("Posição na empresa: desenvolvedor");
        super.mostrarDados(desenvolvedor);
        System.out.println("Posição na empresa: desenvolvedor");

    }
}
