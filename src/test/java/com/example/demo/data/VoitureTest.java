package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void testConstructorVoidAndSetters() {
        // Arrange :
        Voiture voiture = new Voiture();

        // Act : 
        voiture.setMarque("Porsche");
        voiture.setPrix(221400);
        voiture.setId(1);

        // Assert :
        assertEquals("Porsche", voiture.getMarque());
        assertEquals(221400, voiture.getPrix());
        assertEquals(1, voiture.getId());
    }

    @Test
    void testConstructorWithParameterAndGetters() {
        // Arrange & Act :
        Voiture voiture = new Voiture("Mercedes", 70400);

        // Assert :
        assertEquals("Mercedes", voiture.getMarque());
        assertEquals(70400, voiture.getPrix());
        // On vérifie si le constructeur a bien assigné automatiquement l'id
        assertEquals(0, voiture.getId()); 
    }

    @Test
    void testToString() {
        // Arrange : 
        Voiture voiture = new Voiture("Tesla", 58138);
        voiture.setId(5);

        // Act :
        String attendedResult = "Car{brand='Tesla', price=58138, id=5}";
        String obtainedResult = voiture.toString();

        // Assert :
        assertEquals(attendedResult, obtainedResult);
    }

}
