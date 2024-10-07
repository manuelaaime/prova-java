package NotaAula1.Questao1.src;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    double media;

    public double calcularMedia(double nota1, double nota2, double nota3) {
        this.media = (nota1 + nota2 + nota3) / 3;
        return this.media;
    }

    public void verificarAprovacao(double media) {
        if (media >= 70 && media <= 100) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 41 && media <= 69) {
            System.out.println("Situação: Recuperação");
        } else if (media <= 40) {
            System.out.println("Situação: Reprovado");
        }
        else {
            System.out.println("Erro: Média Não Esperada");
        }
    }

    public void exibirDetalhesAluno(String nome, double nota1, double nota2, double nota3) {
        System.out.printf("O(A) Aluno(a): %s \n", this.nome);
        System.out.printf("Obteve a média: %.1f \n", this.media);
        System.out.printf("1º nota: %.1f \n", this.nota1);
        System.out.printf("2º nota: %.1f \n", this.nota2);
        System.out.printf("3º nota: %.1f \n", this.nota3);
    }
}
