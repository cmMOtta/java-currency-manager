
import java.util.ArrayList;

// Classe Cofrinho
class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    // guardar moeda
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }
    // retirar a moeda
    public boolean removerMoeda(double valor, String tipo) {
        for (Moeda moeda : moedas) {
            if (moeda.getNome().equalsIgnoreCase(tipo) && moeda.getValor() == valor) {
                moedas.remove(moeda);
                return true;
            }
        }
        return false;
    }
    // listagem das moedas dentro do cofre
    public void listarMoedas() {
        if (moedas.isEmpty()) {
        	// Caso não tenha nenhuma moeda guardada
            System.out.println("O cofrinho está vazio.");
        } else {
        	
        	// lista de moedas
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : moedas) {
                System.out.println(moeda);
            }
        }
    }
    // soma do valor total em reais dentro do cofre
    public double calcularTotalEmReais() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}
