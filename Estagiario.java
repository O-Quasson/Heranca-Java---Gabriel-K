import java.util.Scanner;

public class Estagiario extends Funcionarios{

    //super(getano,getcpf,getdepartamento,getdia,getmes,getnome,getsalario);

    Scanner scanner = new Scanner(System.in);

    public Estagiario(String nome, Double salario, String departamento, String cpf, int dia, int mes, int ano){
        super(nome, salario, departamento, cpf, dia, mes, ano);
    }

    void fazerTarefa(Estagiario estagiario){
        System.out.println("Qual tarefa deseja que ele faça? ");
        String tarefa = scanner.next();
        System.out.println(estagiario + " agora está a " + tarefa);
    }

    @Override
    void mostrarDados (Estagiario estagiario){
        // System.out.println("Nome: " + estagiario.getnome());
        // System.out.println("Data de nascimento: " + estagiario.getdia() + "/" + estagiario.getmes() + "/" + estagiario.getano());
        // System.out.println("Salário: " + estagiario.getsalario());
        // System.out.println("Departamento: " + estagiario.getdepartamento());
        super.mostrarDados(estagiario);
        System.out.println("Posição na empresa: estagiario");
    }
}
