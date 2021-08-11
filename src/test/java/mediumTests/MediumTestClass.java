package mediumTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MediumTestClass {

    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - average value

    @Test
    public void testAverageValue() {
        double average = calc.averageValue(8, 6, 5);
        assertEquals("(8+6+5)/3 must be 6.333333333333333", 6.333333333333333, average);
    }

    //TODO (**)
    //add tests for new method - even or odd

    @Test(groups = {"smoke"})
    public void testEvenOrOdd() {
        boolean res = calc.evenOrOdd(4);
        assertEquals("4 is even, so we expected true", true, res);
    }

    //TODO (**)
    //add tests for new method - biggest value
    @Test
    public void testBiggerOfTwoNumbers() {
        int res = calc.biggerOfTwoNumbers(5, 6);
        assertEquals("expected 6 'cause it bigger then 5", 6, res);
    }

}
