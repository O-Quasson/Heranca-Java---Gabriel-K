import java.util.Scanner;

public class Estagiario extends Funcionarios{

    //super(getano,getcpf,getdepartamento,getdia,getmes,getnome,getsalario);

    Scanner scanner = new Scanner(System.in);

    public Estagiario (String nome, String sobrenome, Double salario, String departamento, String cpf, int dia, int mes, int ano,int tipo){
        super(nome, sobrenome, salario, departamento, cpf, dia, mes, ano, tipo); 
    }

    void fazerTarefa(Funcionarios funcionarios){
        System.out.println("Qual tarefa deseja que ele faça? ");
        String tarefa = scanner.next();
        System.out.println(funcionarios.getnome() + " agora está a " + tarefa);
    }

    @Override
    void mostrarDados (Funcionarios funcionarios){
        // System.out.println("Nome: " + estagiario.getnome());
        // System.out.println("Data de nascimento: " + estagiario.getdia() + "/" + estagiario.getmes() + "/" + estagiario.getano());
        // System.out.println("Salário: " + estagiario.getsalario());
        // System.out.println("Departamento: " + estagiario.getdepartamento());
        super.mostrarDados(funcionarios);
        System.out.println("Posição na empresa: estagiario");
    }
}
