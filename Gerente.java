public class Gerente extends Funcionarios {

    public Gerente (String nome, String sobrenome, Double salario, String departamento, String cpf, int dia, int mes, int ano,int tipo){
        super(nome, sobrenome, salario, departamento, cpf, dia, mes, ano, tipo); 
    }

    void realizarReuniao(int id, Funcionarios... funcionarios){
        if(id>1){
            System.out.println("Você realizou uma reunião com: ");
            for(int i = 0; i < id;i++){
                System.out.println(funcionarios[i].getnome());
            }
        }else{
            System.out.println("Não há funcionários o suficiente para realizar uma reunião");
        }
    }

    //eu sequer posso fazer desse jeito?
    @Override
    void mostrarDados (Funcionarios funcionarios){
        // System.out.println("Nome: " + gerente.getnome());
        // System.out.println("Data de nascimento: " + gerente.getdia() + "/" + gerente.getmes() + "/" + gerente.getano());
        // System.out.println("Salário: " + gerente.getsalario());
        // System.out.println("Departamento: " + gerente.getdepartamento());
        super.mostrarDados(funcionarios);
        System.out.println("Posição na empresa: gerente");
    }
}
