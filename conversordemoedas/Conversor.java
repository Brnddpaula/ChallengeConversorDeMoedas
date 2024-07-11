package conversordemoedas;

public class Conversor {
    // Método para converter um valor de uma moeda para outra
    public double converter(double valor, double taxaOrigem, double taxaDestino) {
        return valor * (taxaDestino / taxaOrigem);
    }
}
