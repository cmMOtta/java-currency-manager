
// Classe abstrata Moeda
abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

   // Método que retorna o valor da moeda
    public double getValor() {
        return valor;
    }
   // conversão se necessária
    public abstract double converterParaReal();

    // retorna o nome da moeda adicionada ao cofrinho
    public abstract String getNome();

    // retorna a lista de moedas de maneira legível
    @Override
    public String toString() {
        return getNome() + " - Valor: " + valor; 
    }
}
