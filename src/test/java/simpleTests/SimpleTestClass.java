package simpleTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SimpleTestClass {

    Calculator calc = new Calculator();

    @Test(groups = {"regression"})
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    //add tests for new methods (multiply, division, subtraction, square root, x^2)
    @Test
    public void testSubtractionMethod() {
        int actualResult = calc.sub(10, 8);
        assertEquals("10 - 8 must be 2", 2, actualResult);
    }


    @Test
    public void testMultiplyMethod() {
        int multResult = calc.multiple(2, 4);
        assertEquals("2 * 4 must be 8", 8, multResult);
    }

    @Test
    public void testDivisionMethod() {
        int division = calc.division(6, 3);
        assertEquals("6 / 3 must be 2", 2, division);
    }

    @Test
    public void testSquareRootMethod() {
        double res = calc.squareRoot(9);
        assertEquals("square root of 9 must be 3", 3.0, res);
    }

    @Test
    public void testPowMethod() {
        double res = calc.powMethod(3);
        assertEquals("3^2 must be 9", 9.0, res);

    }
}


