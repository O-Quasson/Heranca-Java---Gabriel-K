import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int esc = 0;
        int id = 0;
        int esc2 = 0;
        int esc3 = 0;
        String nome;
        String sobrenome;
        Double salario;
        String departamento;
        String cpf;
        int dia;
        int mes;
        int ano;
        int tipo;
        Funcionarios[] funcionario = new Funcionarios[10];
        Desenvolvedor ponte2 = new Desenvolvedor(null, null, null, null, null, 0, 0, 0, 2);
        Gerente ponte3 = new Gerente(null, null, null, null, null, 0, 0, 0, 3);
        Estagiario ponte4 = new Estagiario(null, null, null, null, null, 0, 0, 0, 4);

        while(esc!=5){
            System.out.println("Escolha uma das seguintes opções: ");
            System.out.println("1 - Cadastrar novos funcionários ");
            System.out.println("2 - Exibir funcionários cadastrados ");
            System.out.println("3 - Atribuir tipo de funcionário ");
            System.out.println("4 - Dar alguma ordem à um funcionário ");
            System.out.println("5 - Sair ");
            esc = scanner.nextInt();
            System.out.println("\n");

            switch(esc){
                case 1:

                    if(id == 10){
                        System.out.println("Quantidade máxima de funcionários cadastrados atingida (eu só não sei criar array infinito em java)\n");
                    }else{
                        System.out.println("Insira o nome do funcionário: ");
                        nome = scanner.next();
                        System.out.println("\n");

                        System.out.println("Insira o sobrenome do funcionário: ");
                        sobrenome = scanner.next();
                        System.out.println("\n");

                        System.out.println("Insira o salario que ele recebe: ");
                        salario = scanner.nextDouble();
                        System.out.println("\n");

                        System.out.println("Insira o departamento a que ele pertence: ");
                        departamento = scanner.next();
                        System.out.println("\n");

                        System.out.println("Insira o cpf do funcionário: ");
                        cpf = scanner.next();
                        System.out.println("\n");

                        System.out.println("Insira a dia em que ele nasceu : ");
                        dia = scanner.nextInt();
                        System.out.println("\n");

                        System.out.println("Insira o mês em que ele nasceu : ");
                        mes = scanner.nextInt();
                        System.out.println("\n");

                        System.out.println("Insira o ano em que ele nasceu : ");
                        ano = scanner.nextInt();
                        System.out.println("\n");

                        tipo = 1;
                        //1 = funcionario 
                        //2 = desenvolvedor
                        //3 = gerente
                        //4 = estagiario

                        funcionario[id] = new Funcionarios(nome, sobrenome, salario, departamento, cpf, dia, mes, ano, tipo);
                        id = id+1;

                        System.out.println("Funcionário cadastrado com sucesso\n");
                    }

                break;

                case 2:
                    if(id>=1){
                        for(int i = 0; i < id; i ++){
                            System.out.println(i+1 + " - " + funcionario[i].getnome() + "\n");
                        }
                        
                        System.out.println("Escolha um dos funcionários acima:");
                        esc2 = scanner.nextInt();
                        System.out.println("\n");

                        if(funcionario[esc2-1]==null){
                            System.out.println("Esse funcionário não existe. Tente novamente mais tarde\n");
                        }else{
                            if (funcionario[esc2-1].gettipo()==1) {
                                funcionario[esc2-1].mostrarDados(funcionario[esc2-1]);
                            }else if(funcionario[esc2-1].gettipo()==2){
                                ponte2.mostrarDados(funcionario[esc2-1]);
                            }else if(funcionario[esc2-1].gettipo()==3){
                                ponte3.mostrarDados(funcionario[esc2-1]);
                            }else if(funcionario[esc2-1].gettipo()==4){
                                ponte4.mostrarDados(funcionario[esc2-1]);
                            }
                        }
                    }else{
                        System.out.println("Não há funcionários cadastrados");
                    }
                    System.out.println("\n");

                break;

                case 3:
                    if(id>=1){
                        for(int i = 0; i < id; i ++){
                            System.out.println(i+1 + " - " + funcionario[i].getnome() + "\n");
                        }
                        System.out.println("Escolha um dos funcionários acima:");
                        esc2 = scanner.nextInt();
                        System.out.println("\n");

                        if(funcionario[esc2-1]==null){
                            System.out.println("Esse funcionário não existe. Tente novamente mais tarde\n");
                        }else{
                            System.out.println("Qual tipo de funcionário deseja aplicar à " + funcionario[esc2-1].getnome() + "?");
                            System.out.println("1 - Funcionário comum");
                            System.out.println("2 - Desenvolvedor");
                            System.out.println("3 - Gerente");
                            System.out.println("4 - Estagiário\n");
                            esc3 = scanner.nextInt();

                            if((esc3>0)&&(esc3<5)){
                                funcionario[esc2-1] = new Funcionarios(funcionario[esc2-1].getnome(), funcionario[esc2-1].getsobrenome(),funcionario[esc2-1].getsalario(), funcionario[esc2-1].getdepartamento(), funcionario[esc2-1].getcpf(), funcionario[esc2-1].getdia(), funcionario[esc2-1].getmes(), funcionario[esc2-1].getano(), esc3);
                                System.out.println("\nTipo de funcionário atribuído com sucesso\n");
                            }else{
                                System.out.println("Esse tipo de funcionário não existe\n");
                            }
                        }
                    }else{
                        System.out.println("Não há funcionários para você atribuir um tipo\n");
                    }
                    
                break;
                
                case 4:
                    if(id>=1){
                        for(int i = 0; i < id; i ++){
                            System.out.println(i+1 + " - " + funcionario[i].getnome() + "\n");
                        }

                        System.out.println("Escolha um dos funcionários acima:");
                        esc2 = scanner.nextInt();
                        System.out.println("\n");

                        if(funcionario[esc2-1]==null){
                            System.out.println("Esse funcionário não existe. Tente novamente mais tarde\n");
                        }else{
                            System.out.println("O que você quer que " + funcionario[esc2-1].getnome() + " faça?: ");
                            System.out.println("\n");

                                System.out.println("1 - Bater ponto");

                            if (funcionario[esc2-1].gettipo()==2) {
                                System.out.println("2 - Programar");
                            }else if(funcionario[esc2-1].gettipo()==3){
                                System.out.println("2 - Realizar reunião");
                            }else if(funcionario[esc2-1].gettipo()==4){
                                System.out.println("2 - Fazer alguma tarefa ordenada");
                            }

                            esc3 = scanner.nextInt();
                            System.out.println("\n");
                            if(esc3==1){
                                funcionario[esc2-1] = null;

                                for(int i = esc2-1;i < id; i++){
                                    funcionario[i] = funcionario[i+1];
                                }

                                funcionario[id-1] = null;

                                id = id - 1;

                                System.out.println("O funcionário bateu ponto e foi embora\n");
                            }else if((esc3==2)&&(funcionario[esc2-1].gettipo()==2)){
                                ponte2.programar(funcionario[esc2-1]);
                            }else if((esc3==2)&&(funcionario[esc2-1].gettipo()==3)){
                                ponte3.realizarReuniao(id, funcionario);
                            }else if((esc3==2)&&(funcionario[esc2-1].gettipo()==4)){
                                ponte4.fazerTarefa(funcionario[esc2-1]);
                            }else{
                                System.out.println("Ordem não reconhecida. Tente novamente mais tarde\n");
                            }
                        }
                    }else{
                        System.out.println("Não há funcionários para você ordenar!\n");
                    }
                    break;

                case 5:
                    System.out.println("Você escolheu sair. Tenha um bom dia!");
                break;

                default:
                System.out.println("Isso não é uma opção\n");
            }
        }

        scanner.close();
    }
}
