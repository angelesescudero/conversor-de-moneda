import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiMonedas {
    private String urlBase = "https://v6.exchangerate-api.com/v6/";
    private String claveDeApi = "86af8430c2e38757e413a3ee";

    public Monedas buscarMoneda(String tipoDeMonedaOrigen, String tipoDeMonedaDestino){
        URI direccion = URI.create(urlBase + claveDeApi + "/pair/" + tipoDeMonedaOrigen + "/" + tipoDeMonedaDestino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response= client
                    .send(solicitud, HttpResponse.BodyHandlers.ofString());
            System.out.println("URL: " + direccion);  // Para depurar
            System.out.println("Response: " + response.body());  // Para depurar
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e){
            throw new RuntimeException("No se ha encontrado ese tipo de moneda");
        }


    }

}
