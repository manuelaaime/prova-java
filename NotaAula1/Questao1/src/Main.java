package NotaAula1.Questao1.src;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno();

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        a.nome = sc.next();
        System.out.println("Insira sua primeira nota:");
        a.nota1 = sc.nextDouble();
        System.out.println("Insira sua segunda nota:");
        a.nota2 = sc.nextDouble();
        System.out.println("Insira sua terceira nota:");
        a.nota3 = sc.nextDouble();

        a.calcularMedia(a.nota1,a.nota2,a.nota3);
        a.exibirDetalhesAluno(a.nome, a.nota1, a.nota2, a.nota3);
        a.verificarAprovacao(a.media);
    }
}
