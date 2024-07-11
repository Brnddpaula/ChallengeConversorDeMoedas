package exchangerateapi;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiTaxasCambio {

    // Método para obter as taxas de câmbio da API
    public JsonObject obterTaxas() throws Exception {
        // URL da API ExchangeRate-API com sua chave de API
        String url = "https://v6.exchangerate-api.com/v6/96b7f379213bfc2741dd1033/latest/USD";

        // Configurando o cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        // Enviando a solicitação e obtendo a resposta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Parseando a resposta JSON e retornando o objeto contendo as taxas de câmbio
        JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
        return jsonObject.getAsJsonObject("conversion_rates");
    }
}
