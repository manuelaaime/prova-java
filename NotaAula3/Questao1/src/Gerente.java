package NotaAula3.Questao1.src;

class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, String nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.printf("Projeto: %s\n", projeto);
    }
}
