package interfaceusuario;

import conversordemoedas.Conversor;
import exchangerateapi.ApiTaxasCambio;
import com.google.gson.JsonObject;

import java.util.Scanner;

public class AppConversorMoedas {

    // Método para exibir o menu de opções para o usuário
    private static void mostrarMenu() {
        System.out.println("Conversor de Moedas");
        System.out.println("1. USD para ARS");
        System.out.println("2. ARS para USD");
        System.out.println("3. USD para BOB");
        System.out.println("4. BOB para USD");
        System.out.println("5. USD para BRL");
        System.out.println("6. BRL para USD");
        System.out.println("7. USD para CLP");
        System.out.println("8. CLP para USD");
        System.out.println("9. USD para COP");
        System.out.println("10. COP para USD");
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
                double resultado;

                // Realiza a conversão com base na opção selecionada
                switch (opcao) {
                    case 1:
                        resultado = conversor.converter(valor, taxas.get("USD").getAsDouble(), taxas.get("ARS").getAsDouble());
                        System.out.printf("%.2f USD é igual a %.2f ARS\n", valor, resultado);
                        break;
                    case 2:
                        resultado = conversor.converter(valor, taxas.get("ARS").getAsDouble(), taxas.get("USD").getAsDouble());
                        System.out.printf("%.2f ARS é igual a %.2f USD\n", valor, resultado);
                        break;
                    case 3:
                        resultado = conversor.converter(valor, taxas.get("USD").getAsDouble(), taxas.get("BOB").getAsDouble());
                        System.out.printf("%.2f USD é igual a %.2f BOB\n", valor, resultado);
                        break;
                    case 4:
                        resultado = conversor.converter(valor, taxas.get("BOB").getAsDouble(), taxas.get("USD").getAsDouble());
                        System.out.printf("%.2f BOB é igual a %.2f USD\n", valor, resultado);
                        break;
                    case 5:
                        resultado = conversor.converter(valor, taxas.get("USD").getAsDouble(), taxas.get("BRL").getAsDouble());
                        System.out.printf("%.2f USD é igual a %.2f BRL\n", valor, resultado);
                        break;
                    case 6:
                        resultado = conversor.converter(valor, taxas.get("BRL").getAsDouble(), taxas.get("USD").getAsDouble());
                        System.out.printf("%.2f BRL é igual a %.2f USD\n", valor, resultado);
                        break;
                    case 7:
                        resultado = conversor.converter(valor, taxas.get("USD").getAsDouble(), taxas.get("CLP").getAsDouble());
                        System.out.printf("%.2f USD é igual a %.2f CLP\n", valor, resultado);
                        break;
                    case 8:
                        resultado = conversor.converter(valor, taxas.get("CLP").getAsDouble(), taxas.get("USD").getAsDouble());
                        System.out.printf("%.2f CLP é igual a %.2f USD\n", valor, resultado);
                        break;
                    case 9:
                        resultado = conversor.converter(valor, taxas.get("USD").getAsDouble(), taxas.get("COP").getAsDouble());
                        System.out.printf("%.2f USD é igual a %.2f COP\n", valor, resultado);
                        break;
                    case 10:
                        resultado = conversor.converter(valor, taxas.get("COP").getAsDouble(), taxas.get("USD").getAsDouble());
                        System.out.printf("%.2f COP é igual a %.2f USD\n", valor, resultado);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
            scanner.close(); // Fecha o scanner
        } catch (Exception e) {
            // Captura e exibe qualquer exceção que ocorra durante a obtenção das taxas de câmbio
            System.out.println("Erro ao obter as taxas de câmbio: " + e.getMessage());
        }
    }
}
