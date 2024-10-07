package NotaAula3.Questao2.src;


class Animal {
    protected String nome;
    protected String raca;

    public Animal() {}

    public Animal(String nome) {
        this.nome = nome;
    }

    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }
}
