package org.example;

import org.example.entity.Calculatrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {
    //Test de la Méthode addition
    @Test
    public void testAddition() {
        //A => Arrange
        Calculatrice  calculatrice = new Calculatrice();

        // A => Act
        double result = calculatrice.addition(10,20);

        //A => Assert
         Assertions.assertEquals(30, result);
    }
    //Test de la Méthode division
    @Test
    public void testDivision() {
        //A => Arrange
        Calculatrice  calculatrice = new Calculatrice();

        // A => Act
        double result = calculatrice.division(10,0);

        //A => Assert
        Assertions.assertEquals(5, result);

    }
    @Test
    public void testDivisionEgal0() {
        //A => Arrange
        Calculatrice  calculatrice = new Calculatrice();

        Assertions.assertThrowsExactly(RuntimeException.class, ()->{
            // A => Act
            double result = calculatrice.division(10,0);
        });

    }
}
