package NotaAula2.Questao1.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipo = scanner.nextInt();

        ContaBancaria conta = null;
        System.out.print("Nome do titular: ");
        String titular = scanner.nextLine();

        switch (tipo) {
            case 1:
                conta = new ContaCorrente(titular);
                break;
            case 2:
                System.out.print("Taxa Selic: ");
                double selic = scanner.nextDouble();
                conta = new ContaPoupanca(titular, selic);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }
        /* Não encontrei uma forma de verificar se a classe de conta é
        conta corrente / bancaria / poupança que não fosse usando instanceof
        (usado para verificar a origem de uma variavel (string, int, ou classes)) */

        while (true) {
            System.out.println("\nMenu de opções:");
            if (conta instanceof ContaCorrente) {
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Usar Cheque Especial");
                System.out.println("4. Exibir Dados da Conta");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Calcular Rendimento");
                System.out.println("4. Exibir Dados da Conta");
            }

            int opcao = scanner.nextInt();
            double valor;

            switch (opcao) {
                case 1:
                    System.out.print("Valor a depositar: ");
                    valor = scanner.nextDouble();
                    if (conta instanceof ContaCorrente) {
                        ((ContaCorrente) conta).depositar(valor);
                    } else if (conta instanceof ContaPoupanca) {
                        ((ContaPoupanca) conta).depositar(valor);
                    }
                    break;
                case 2:
                    System.out.print("Valor a sacar: ");
                    valor = scanner.nextDouble();
                    if (conta instanceof ContaCorrente) {
                        ((ContaCorrente) conta).sacar(valor);
                    } else if (conta instanceof ContaPoupanca) {
                        ((ContaPoupanca) conta).sacar(valor);
                    }
                    break;
                case 3:
                    if (conta instanceof ContaCorrente) {
                        System.out.print("Valor a usar do cheque especial: ");
                        valor = scanner.nextDouble();
                        ((ContaCorrente) conta).usarChequeEspecial(valor);
                    } else if (conta instanceof ContaPoupanca) {
                        System.out.println("Rendimento: " + ((ContaPoupanca) conta).calcularRendimento());
                    }
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}