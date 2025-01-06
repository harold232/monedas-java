package com.mycompany.monedasapp;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    
    public Conversion convertir(String monedaInicial, String monedaConvertida, int monto) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/65be6f383cb69ef160ed383b/pair/" + 
                monedaInicial + "/" + monedaConvertida + "/" + monto);
        
        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response);
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception ex) {
            throw new RuntimeException("Conversion fallida");
        }
    }
    
}
