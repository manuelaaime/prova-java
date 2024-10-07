package NotaAula3.Questao1.src;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Gerente");
            System.out.println("2. Cadastrar Programador");
            System.out.println("3. Exibir detalhes do funcionário");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do gerente: ");
                    String nomeGerente = scanner.nextLine();
                    System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
                    String nascGerente = scanner.nextLine();
                    System.out.print("Digite o salário: ");
                    double salarioGerente = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite o projeto: ");
                    String projeto = scanner.nextLine();
                    funcionario = new Gerente(nomeGerente, nascGerente, salarioGerente, projeto);
                    break;
                case 2:
                    System.out.print("Digite o nome do programador: ");
                    String nomeProgramador = scanner.nextLine();
                    System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
                    String nascProgramador = scanner.nextLine();
                    System.out.print("Digite o salário: ");
                    double salarioProgramador = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite a linguagem de programação: ");
                    String linguagem = scanner.nextLine();
                    funcionario = new Programador(nomeProgramador, nascProgramador, salarioProgramador, linguagem);
                    break;
                case 3:
                    if (funcionario != null) {
                        System.out.println("Detalhes do Funcionário:");
                        System.out.printf("Nome: %s\n", funcionario.nome);
                        System.out.printf("Data de Nascimento: %s\n", funcionario.nasc);
                        funcionario.informarSalario();
                        funcionario.calcularIdade();
                        if (funcionario instanceof Gerente) {
                            ((Gerente) funcionario).informarProjeto();
                        } else if (funcionario instanceof Programador) {
                            ((Programador) funcionario).informarLinguagem();
                        }
                    } else {
                        System.out.println("Nenhum funcionário cadastrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}