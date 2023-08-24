package org.example;

import org.example.entity.Bisextil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BisextilTest {
    private Bisextil bisextil;
    @Test
    public void testYearBisextilShouldBeTrueWhenYearIs2000(){
        bisextil =   new Bisextil();
        boolean result = bisextil.bisextil(2000);
        Assertions.assertTrue(result);
    }
    @Test
    public void testYearBisextilShouldBeFalseWhenYearIs2023(){
        bisextil =   new Bisextil();
        boolean result = bisextil.bisextil(2023);
        Assertions.assertFalse(result);
    }

}
