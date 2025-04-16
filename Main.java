import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int esc = 0;
        int id = 0;
        int esc2 = 0;
        Funcionarios[] funcionario = new Funcionarios[10];

        while(esc!=4){
            System.out.println("Escolha uma das seguintes opções: ");
            System.out.println("1 - Cadastrar novos funcionários ");
            System.out.println("2 - Exibir funcionários cadastrados ");
            System.out.println("3 - Atribuir tipo de funcionário ");
            System.out.println("4 - Sair ");
            esc = scanner.nextInt();

            switch(esc){
                case 1:

                    if(id == 10){
                        System.out.println("Quantidade máxima de funcionários cadastrados atingida (eu só não sei criar array infinito em java)");
                    }else{
                        id = id+1;
                        System.out.println("Insira o nome do funcionário: ");
                        String nome = scanner.next();

                        System.out.println("Insira o salario que ele recebe: ");
                        Double salario = scanner.nextDouble();

                        System.out.println("Insira o departamento a que ele pertence: ");
                        String departamento = scanner.next();

                        System.out.println("Insira o cpf do funcionário: ");
                        String cpf = scanner.next();

                        System.out.println("Insira a dia em que ele nasceu : ");
                        int dia = scanner.nextInt();

                        System.out.println("Insira o mês em que ele nasceu : ");
                        int mes = scanner.nextInt();

                        System.out.println("Insira o ano em que ele nasceu : ");
                        int ano = scanner.nextInt();

                        funcionario[id-1] = new Funcionarios(nome, salario, departamento, cpf, dia, mes, ano);

                        System.out.println("Funcionário cadastrado");
                    }

                break;

                case 2:

                    for(int i = 0; i < funcionario.length; i ++){
                        System.out.println(i + " - " + funcionario[i].getnome());
                    }
                    System.out.println("Escolha um dos funcionários acima: ");
                    esc2 = scanner.nextInt();

                    if(funcionario[esc2]==null){
                        System.out.println("Esse funcionário não existe. Tente novamente mais tarde");
                    }else{
                        funcionario[esc2].mostrarDados(funcionario[esc2]);
                    }

                break;

                case 3:
                break;

                case 4:
                    System.out.println("Você escolheu sair. Tenha um bom dia!");
                break;

                default:
                System.out.println("Isso não é uma opção");
            }
        }

        scanner.close();
    }
}
