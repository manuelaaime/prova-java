package NotaAula2.Questao2.src;

public class CorridaUber {
    // Atributos
    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;

    // Construtor
    public CorridaUber(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }

    public double calcularValorCorrida() {
        return (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }

    public void exibirDetalhesCorrida() {
        double valorFinal = calcularValorCorrida();
        System.out.println("Detalhes da Corrida:");
        System.out.println("Distância: " + distancia + " km");
        System.out.println("Tempo de Espera: " + tempoEspera + " minutos");
        System.out.println("Tarifa Base: R$ " + tarifaBase);
        System.out.println("Fator de Demanda: " + fatorDemanda);
        System.out.println("Valor Final da Corrida: R$ " + valorFinal);
    }

}
