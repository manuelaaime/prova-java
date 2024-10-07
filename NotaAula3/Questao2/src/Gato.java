package NotaAula3.Questao2.src;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public void mia() {
        System.out.println(nome + " está miando.");
    }
}