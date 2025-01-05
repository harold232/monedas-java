package com.mycompany.monedasapp;

import java.net.URI;
import java.net.http.HttpClient;

public class TasaDeCambio {
    
    public float convertir(String monedaInicial, String monedaConvertida, float monto) {
        URI direccion = URI.create("");
        HttpClient client = HttpClient.newHttpClient();
        float resultado = 0;
        
        
        return resultado;
    }
    
}
