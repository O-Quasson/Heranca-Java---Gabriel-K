public class Gerente extends Funcionarios {

    public Gerente (String nome, Double salario, String departamento, String cpf, int dia, int mes, int ano){
        super(nome, salario, departamento, cpf, dia, mes, ano); 
    }

    void realizarReuniao(Funcionarios... funcionarios){
        if(funcionarios.length>1){
            System.out.println("Você realizou uma reunião com: ");
            for(int i = 0; i < funcionarios.length;i++){
                System.out.println(funcionarios[i]);
            }
        }else{
            System.out.println("Não há funcionários o suficiente para realizar uma reunião");
        }
    }

    //eu sequer posso fazer desse jeito?
    @Override
    void mostrarDados (Gerente gerente){
        // System.out.println("Nome: " + gerente.getnome());
        // System.out.println("Data de nascimento: " + gerente.getdia() + "/" + gerente.getmes() + "/" + gerente.getano());
        // System.out.println("Salário: " + gerente.getsalario());
        // System.out.println("Departamento: " + gerente.getdepartamento());
        super.mostrarDados(gerente);
        System.out.println("Posição na empresa: Gerente");
    }
}
