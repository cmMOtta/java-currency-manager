
import java.util.Scanner;

// Classe Principal
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao;

        
        //Representação da interface do cofrinho
        do {
            System.out.println("\n--- Cofrinho de Moedas ---");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em reais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	
                	//Escolhendo o tipo de moeda a ser guardada no cofrinho
                    System.out.println("Escolha o tipo de moeda: 1-Real, 2-Dólar, 3-Euro");
                    int tipoMoeda = scanner.nextInt();
                    
                    //Informando o valor da moeda a ser guardada
                    System.out.print("Digite o valor da moeda: ");
                    double valor = scanner.nextDouble();

                    //Verificação do tipo de moeda informado
                    switch (tipoMoeda) {
                        case 1:
                            cofrinho.adicionarMoeda(new Real(valor));
                            break;
                        case 2:
                            cofrinho.adicionarMoeda(new Dolar(valor));
                            break;
                        case 3:
                            cofrinho.adicionarMoeda(new Euro(valor));
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido!");
                            break;
                    }
                    break;
                    
                    //retirada das moedas do cofre
                case 2:
                	
                	//Escolhendo o tipo de moeda a ser retirada do cofrinho
                    System.out.print("Digite o tipo de moeda a remover (Real/Dólar/Euro): ");
                    String tipo = scanner.next();
                    
                    //Informando o valor da moeda a ser removida
                    System.out.print("Digite o valor da moeda a remover: ");
                    double valorRemover = scanner.nextDouble();

                    
                   //Verificação da moeada
                    if (cofrinho.removerMoeda(valorRemover, tipo)) {
                        System.out.println("Moeda removida com sucesso.");
                    } else {
                        System.out.println("Moeda não encontrada.");
                    }
                    break;
                case 3:
                	
                	//Lista das moedas presente dentro do cofrinho
                    cofrinho.listarMoedas();
                    break;
                    
                    //Informa o valor total em reais guardado
                case 4:
                    System.out.printf("Total em reais: R$ %.2f\n", cofrinho.calcularTotalEmReais());
                    break;
                case 0:
                	
                	//Finaliza e retorna a operação
                    System.out.println("Saindo...");
                    break;
                default:
                	
                	//Verificação dos casos possíveis
                    System.out.println("Opção inválida!");
                    break;
            }
            
            //Repetição do programa 
            
        } while (opcao != 0);

        scanner.close();
    }
}
