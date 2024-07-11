package conversordemoedas;

public class Conversor {

    // Método para converter um valor de uma moeda para outra
    public double converter(double valor, double taxaOrigem, double taxaDestino) {
        // Calcula o valor convertido usando as taxas de câmbio de origem e destino
        return valor * (taxaDestino / taxaOrigem);
    }
}
