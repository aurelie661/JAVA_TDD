package org.example;
import org.example.entity.Bisextil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BisextilTest {
    private Bisextil bisextil;

    @BeforeEach
    public void setUp(){
        bisextil = new Bisextil();
    }
    @Test
    public void testYearBisextilShouldBeTrueWhenYearIs2000(){
        boolean result = bisextil.bisextil(2000);
        Assertions.assertTrue(result);
    }
    @Test
    public void testYearBisextilShouldBeFalseWhenYearIs2023(){
        boolean result = bisextil.bisextil(2023);
        Assertions.assertFalse(result);
    }

}
