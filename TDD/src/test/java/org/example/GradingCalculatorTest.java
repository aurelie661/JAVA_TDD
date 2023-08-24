package org.example;
import org.example.entity.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {
    private GradingCalculator gradingCalculator;
    private void initGradingCalculator(int score, int attendance) {
        gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(score);
        gradingCalculator.setAttendancePercentage(attendance);
    }
    @Test
    public void getGradeTestScore95andShouldBePercentage90(){
        /*GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(90);*/

        initGradingCalculator(95,90);

        char result  = gradingCalculator.getGrade();

        Assertions.assertEquals('A', result);
    }
    @Test
    public void getGradeTestScore85andShouldBePercentage90(){
       /* GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(85);
        gradingCalculator.setAttendancePercentage(90);*/

        initGradingCalculator(85,90);

        char result  = gradingCalculator.getGrade();

        Assertions.assertEquals('B', result);
    }
    @Test
    public void getGradeTestScore65andShouldBePercentage90(){
        /*GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(90);*/

        initGradingCalculator(65,90);

        char result  = gradingCalculator.getGrade();

        Assertions.assertEquals('C', result);
    }
    @Test
    public void getGradeTestScore95andShouldBePercentage65(){
        /*GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(65);*/

        initGradingCalculator(95,65);

        char result  = gradingCalculator.getGrade();

        Assertions.assertEquals('B', result);
    }
    @Test
    public void getGradeTestScore95andShouldBePercentage55(){
        /*GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(55);*/

        initGradingCalculator(95,55);

        char result  = gradingCalculator.getGrade();

        Assertions.assertEquals('F', result);
    }
    @Test
    public void getGradeTestScore65andShouldBePercentage55(){
        /*GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(55);*/

        initGradingCalculator(65,55);

        char result  = gradingCalculator.getGrade();

        Assertions.assertEquals('F', result);
    }@Test
    public void getGradeTestScore50andShouldBePercentage90(){
        /*GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(50);
        gradingCalculator.setAttendancePercentage(90);*/

        initGradingCalculator(50,90);

        char result  = gradingCalculator.getGrade();

        Assertions.assertEquals('F', result);
    }

}
