package NotaAula3.Questao2.src;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public void late() {
        System.out.println(nome + " está latindo.");
    }
}