package com.anamuc.monedas.services;

import com.anamuc.monedas.modelo.Paises;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/* *
@moleculax
Emilio J. Gomez
17/09/2025
 */
@Service // Notación que indica que es un servicio
public class CurrencyService {

    public List<Paises> getPorPaises(String paisBuscado) {
        List<Paises> resultados = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new ClassPathResource("monedasPaises.csv").getInputStream()))) {

            String linea;
            boolean primera = true;

            while ((linea = br.readLine()) != null) {
                if (primera) {
                    primera = false;
                    continue;
                }

                String[] campos = linea.split(",");

                if (campos.length == 3 && campos[2].trim().equalsIgnoreCase(paisBuscado)) {
                    resultados.add(new Paises(campos[0].trim(), campos[1].trim(), campos[2].trim()));
                }
            }

        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo CSV", e);
        }

        return resultados;
    }

} // END Class