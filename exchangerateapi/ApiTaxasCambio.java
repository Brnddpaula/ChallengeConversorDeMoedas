package exchangerateapi;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiTaxasCambio {

    // Método para obter as taxas de câmbio da API
    public JsonObject obterTaxas() throws Exception {
        String url = "https://v6.exchangerate-api.com/v6/96b7f379213bfc2741dd1033/latest/USD";
        HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
        urlConnection.setRequestMethod("GET"); // Define o método de requisição como GET

        // Buffer para ler a resposta da API
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close(); // Fecha o buffer
        urlConnection.disconnect(); // Desconecta a conexão HTTP

        // Tranformando a resposta JSON e retornando um objeto contendo as taxas de câmbio
        JsonObject jsonObject = JsonParser.parseString(content.toString()).getAsJsonObject();
        return jsonObject.getAsJsonObject("conversion_rates");
    }
}