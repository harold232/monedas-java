package com.mycompany.monedasapp;

public record Conversion(
        String base_code,
        String target_code,
        double conversion_rate,
        double conversion_result) {
}
