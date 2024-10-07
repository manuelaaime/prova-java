package NotaAula2.Questao1.src;

public class ContaPoupanca extends ContaBancaria {
    private double selic;

    public ContaPoupanca(String titular, double selic) {
        super(titular);
        this.selic = selic;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double calcularRendimento() {
        if (selic > 8.5) {
            return 0.005 * saldo;
        } else {
            return 0.007 * selic * saldo;
        }
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Rendimento: " + calcularRendimento());
    }
}
