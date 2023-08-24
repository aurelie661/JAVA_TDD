package org.example;

import org.example.entity.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {
    @Test
    public void getGradeTestScore95andShouldBePercentage90(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(90);

        char c = gradingCalculator.getGrade();
        Assertions.assertEquals('A',c);
    }
    @Test
    public void getGradeTestScore85andShouldBePercentage90(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(85);
        gradingCalculator.setAttendancePercentage(90);

        char c = gradingCalculator.getGrade();
        Assertions.assertEquals('B',c);
    }
    @Test
    public void getGradeTestScore65andShouldBePercentage90(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(90);

        char c = gradingCalculator.getGrade();
        Assertions.assertEquals('C',c);
    }
    @Test
    public void getGradeTestScore95andShouldBePercentage65(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(65);

        char c = gradingCalculator.getGrade();
        Assertions.assertEquals('B',c);
    }
    @Test
    public void getGradeTestScore95andShouldBePercentage55(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(55);

        char c = gradingCalculator.getGrade();
        Assertions.assertEquals('F',c);
    }
    @Test
    public void getGradeTestScore65andShouldBePercentage55(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(55);

        char c = gradingCalculator.getGrade();
        Assertions.assertEquals('F',c);
    }@Test
    public void getGradeTestScore50andShouldBePercentage90(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(50);
        gradingCalculator.setAttendancePercentage(90);

        char c = gradingCalculator.getGrade();
        Assertions.assertEquals('F',c);
    }

}
