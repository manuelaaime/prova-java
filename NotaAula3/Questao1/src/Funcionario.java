package NotaAula3.Questao1.src;

class Funcionario {
    protected String nome;
    protected String nasc;
    protected double salario;

    public Funcionario(String nome, String nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.printf("Salário: R$ %.2f\n", salario);
    }

    public void calcularIdade() {
        // Implementação simplificada para calcular idade
        int anoNascimento = Integer.parseInt(nasc.split("/")[2]);
        int idade = 2024 - anoNascimento;
        System.out.printf("Idade: %d anos\n",idade);
    }
}