
// Classe concreta Real
class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    //Conversão para Real
    @Override
    public double converterParaReal() {
        return valor;
    }

    //identificação da moeda
    @Override
    public String getNome() {
        return "Real";
    }
}
