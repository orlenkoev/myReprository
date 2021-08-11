package application;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    //TODO add method for subtraction
    public int sub(int a, int b) {
        return a - b;
    }

    //TODO add method for multiplication
    public int multiple(int a, int b) {
        return a * b;
    }

    //TODO add method for division
    public int division(int a, int b) {
        return a / b;
    }

    //TODO add method for square root (use Math class)
    public double squareRoot(int a) {
        return Math.sqrt(a);
    }

    //TODO add method for x^2

    public double powMethod(double a) {
        double b = 2;
        return Math.pow(a, b);
    }


    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers

    public double averageValue(double a, double b, double c) {
        return (a + b + c) / 3;
    }


//TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd

    public boolean evenOrOdd(int a) {
        return a % 2 == 0;
    }


//TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals

    public int biggerOfTwoNumbers(int a, int b) {
        if (a == b)
            return 0;
        return Math.max(a, b);
    }

//***************Hard methods************************

//TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter

    public int sumOfAnyQuantityParameters(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

//TODO (*) |divide by zero case| add method for division (check division by zero case
// - if we try to divide by zero - return -100;

    public int divideByZero(int a, int b) {
        if (b == 0)
            return -100;
        return (a / b);
    }
}









