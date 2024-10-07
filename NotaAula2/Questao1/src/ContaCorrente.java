package NotaAula2.Questao1.src;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular) {
        super(titular);
        this.limiteChequeEspecial = 1000.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void usarChequeEspecial(double valor) {
        if (valor <= limiteChequeEspecial) {
            saldo -= valor;
            limiteChequeEspecial -= valor;
        } else {
            System.out.println("Limite do cheque especial excedido!");
        }
    }
}
