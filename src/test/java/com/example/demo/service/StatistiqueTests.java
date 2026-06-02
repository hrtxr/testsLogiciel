package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StatistiqueTests {
    
    @Test
    void testAveragePriceWithCars() {
        // Arrange : 
        StatistiqueImpl statService = new StatistiqueImpl();

        Voiture v1 = new Voiture("Porsche", 221400);
        Voiture v2 = new Voiture("Mercedes", 70400);

        statService.ajouter(v1);
        statService.ajouter(v2);

        // Act : 
        Echantillon resultat = statService.prixMoyen();

        // Assert : 
        assertEquals(2, resultat.getNombreDeVoitures());
        assertEquals(145900, resultat.getPrixMoyen());
    }

    @Test
    void testAveragePriceWithoutCars() {
        // Arrange :
        StatistiqueImpl statService = new StatistiqueImpl();

        // Act & Assert :
        assertThrows(ArithmeticException.class, () -> {
            statService.prixMoyen();
        });
    }
    

}
