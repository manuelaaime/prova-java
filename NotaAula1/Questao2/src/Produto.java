package NotaAula1.Questao2.src;

import java.util.Scanner;
import java.util.UUID;

public class Produto {
    String codigo;
    String nomeProduto;
    double tamanho;
    double peso;
    String cor;
    double preco;
    int quantidade;

    Scanner sc = new Scanner(System.in);

    public void cadastrarProduto() {
        this.codigo = UUID.randomUUID().toString();
        System.out.println("Código do produto gerado automaticamente: " + this.codigo);

        System.out.println("Insira o nome do produto:");
        this.nomeProduto = sc.next();
        System.out.println("Insira o tamanho do produto:");
        this.tamanho = sc.nextDouble();
        System.out.println("Insira o peso do produto:");
        this.peso = sc.nextDouble();
        System.out.println("Insira o preço do produto:");
        this.preco = sc.nextDouble();
        System.out.println("Insira a cor do produto:");
        this.cor = sc.next();
        System.out.println("Insira a quantidade no estoque:");
        this.quantidade = sc.nextInt();
    }

    public void consultarProduto() {
        if (this.nomeProduto == null || this.nomeProduto.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            System.out.println("Código do produto: " + this.codigo);
            System.out.println("Nome do produto: " + this.nomeProduto);
            System.out.println("Tamanho do produto: " + this.tamanho + " cm");
            System.out.println("Peso do produto: " + this.peso + " kg");
            System.out.println("Preço do produto: R$ " + this.preco);
            System.out.println("Cor do produto: " + this.cor);
            System.out.println("Quantidade em estoque: " + this.quantidade);
        }
    }

    public void venderProduto() {
        System.out.println("Digite a quantidade que deseja vender:");
        int quantidadeVendida = sc.nextInt();
        if (this.quantidade >= quantidadeVendida) {
            this.quantidade -= quantidadeVendida;
            System.out.println("Venda realizada com sucesso! Quantidade restante: " + this.quantidade);
            selecionarFormaPagamento(this.preco * quantidadeVendida);
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    private void selecionarFormaPagamento(double valorTotal) {
        System.out.println("Selecione a forma de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Espécie");
        System.out.println("3. Transferência");
        System.out.println("4. Débito");
        System.out.println("5. Crédito");
        int opcaoPagamento = sc.nextInt();

        double valorFinal = valorTotal;
        double desconto = 0;

        switch (opcaoPagamento) {
            case 1: // Pix
            case 2: // Espécie
            case 3: // Transferência
            case 4: // Débito
                desconto = valorTotal * 0.05;
                valorFinal = valorTotal - desconto;
                System.out.printf("Você recebeu um desconto de 5%%. Valor final: R$ %.2f\n", valorFinal);
                if (opcaoPagamento == 2) {
                    System.out.println("Digite o valor pago:");
                    double valorPago = sc.nextDouble();
                    if (valorPago > valorFinal) {
                        double troco = valorPago - valorFinal;
                        System.out.printf("Troco: R$ %.2f\n", troco);
                    } else if (valorPago < valorFinal) {
                        System.out.println("Valor pago insuficiente. Venda não realizada.");
                    }
                }
                break;
            case 5: // Crédito
                System.out.println("Você pode parcelar em até 3x sem juros.");
                System.out.printf("Valor das parcelas: 3 x R$ %.2f\n", valorTotal / 3);
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                break;
        }
    }
}