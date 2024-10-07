package NotaAula1.Questao2.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto p = new Produto();
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Consultar produto");
            System.out.println("3. Vender produto");
            System.out.println("4. Sair da aplicação");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    p.cadastrarProduto();
                    break;
                case 2:
                    p.consultarProduto();
                    break;
                case 3:
                    p.venderProduto();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);
    }
}
