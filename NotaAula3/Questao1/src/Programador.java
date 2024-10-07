package NotaAula3.Questao1.src;

class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, String nasc, double salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.printf("Linguagem: %s\n", linguagem);
    }
}