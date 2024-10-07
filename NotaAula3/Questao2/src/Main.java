package NotaAula3.Questao2.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Cachorro");
            System.out.println("2. Cadastrar Gato");
            System.out.println("3. Exibir detalhes do animal");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cachorro: ");
                    String nomeCachorro = scanner.nextLine();
                    animal = new Cachorro(nomeCachorro);
                    break;
                case 2:
                    System.out.print("Digite o nome do gato: ");
                    String nomeGato = scanner.nextLine();
                    animal = new Gato(nomeGato);
                    break;
                case 3:
                    if (animal != null) {
                        System.out.println("Detalhes do Animal:");
                        System.out.printf("Nome: %s\n", animal.nome);
                        animal.caminha();
                        if (animal instanceof Cachorro) {
                            ((Cachorro) animal).late();
                        } else if (animal instanceof Gato) {
                            ((Gato) animal).mia();
                        }
                    } else {
                        System.out.println("Nenhum animal cadastrado.");
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