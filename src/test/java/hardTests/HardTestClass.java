package hardTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HardTestClass {

    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - divide by zero case
//
    @Test(groups = {"hardTests"})
    public void testOfDivideByZero() {
        int res = calc.divideByZero(6, 0);
        assertEquals("expected -100 'cause we are dividing by zero", -100, res);
    }

    //TODO (**)
    //add tests for new method - addition with multiple parameters
    @Test(groups = {"hardTests"})
    public void testSumOfAnyParameters() {
        int res = calc.sumOfAnyQuantityParameters(5, 1, 2);
        assertEquals("5+1+2 must be 8", 8, res);
    }
}

