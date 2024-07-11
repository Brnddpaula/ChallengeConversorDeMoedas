package interfaceusuario;

import conversordemoedas.Conversor;
import exchangerateapi.ApiTaxasCambio;
import com.google.gson.JsonObject;
import java.util.Scanner;

public class AppConversorMoedas {

    // Método para exibir o menu de opções para o usuário
    private static void mostrarMenu() {
        System.out.println("Conversor de Moedas");
        System.out.println("1. USD para EUR");
        System.out.println("2. EUR para USD");
        System.out.println("3. USD para GBP");
        System.out.println("4. GBP para USD");
        System.out.println("5. USD para JPY");
        System.out.println("6. JPY para USD");
        System.out.println("0. Sair");
        System.out.print("Selecione a opção desejada: ");
    }

    // Método principal para executar o aplicativo
    public static void main(String[] args) {
        ApiTaxasCambio apiClient = new ApiTaxasCambio(); // Instancia o cliente da API
        Conversor conversor = new Conversor(); // Instancia o conversor de moedas
        Scanner scanner = new Scanner(System.in); // Scanner para ler a entrada do usuário

        try {
            JsonObject taxas = apiClient.obterTaxas(); // Obtém as taxas de câmbio da API

            while (true) {
                mostrarMenu(); // Exibe o menu de opções
                int opcao = scanner.nextInt(); // Lê a opção selecionada pelo usuário
                if (opcao == 0) {
                    break; // Sai do loop se o usuário selecionar 0
                }
                System.out.print("Digite o valor a ser convertido: ");
                double valor = scanner.nextDouble(); // Lê o valor a ser convertido
                double resultado = 0;

                //Converte conforme opcao do usuario
                switch (opcao) {
                    case 1:
                        resultado = conversor.converter(valor, taxas.get("USD").getAsDouble(), taxas.get("EUR").getAsDouble());
                        System.out.printf("%.2f USD é igual a %.2f EUR\n", valor, resultado);
                        break;
                    case 2:
                        resultado = conversor.converter(valor, taxas.get("EUR").getAsDouble(), taxas.get("USD").getAsDouble());
                        System.out.printf("%.2f EUR é igual a %.2f USD\n", valor, resultado);
                        break;
                    case 3:
                        resultado = conversor.converter(valor, taxas.get("USD").getAsDouble(), taxas.get("GBP").getAsDouble());
                        System.out.printf("%.2f USD é igual a %.2f GBP\n", valor, resultado);
                        break;
                    case 4:
                        resultado = conversor.converter(valor, taxas.get("GBP").getAsDouble(), taxas.get("USD").getAsDouble());
                        System.out.printf("%.2f GBP é igual a %.2f USD\n", valor, resultado);
                        break;
                    case 5:
                        resultado = conversor.converter(valor, taxas.get("USD").getAsDouble(), taxas.get("JPY").getAsDouble());
                        System.out.printf("%.2f USD é igual a %.2f JPY\n", valor, resultado);
                        break;
                    case 6:
                        resultado = conversor.converter(valor, taxas.get("JPY").getAsDouble(), taxas.get("USD").getAsDouble());
                        System.out.printf("%.2f JPY é igual a %.2f USD\n", valor, resultado);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
            scanner.close();
        } catch (Exception e) {
            // Captura e exibe qualquer exceção que ocorra durante a obtenção das taxas de câmbio
            System.out.println("Erro ao obter as taxas de câmbio: " + e.getMessage());
        }
    }
}


