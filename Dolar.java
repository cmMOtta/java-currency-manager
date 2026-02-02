
// Classe concreta Dolar
class Dolar extends Moeda {
    private static final double TAXA_CONVERSAO = 6.0; // Exemplo de taxa do dia 04/12/2024

    public Dolar(double valor) {
        super(valor);
    }

    // conversão da moeda para Real
    @Override
    public double converterParaReal() {
        return valor * TAXA_CONVERSAO;
    }

    // identificação da moeda
    @Override
    public String getNome() {
        return "Dólar";
    }
}
