import Interfaces.Calculator;

public class CalculatorHandler {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorClass();
        System.out.println(calculator.divide(20, 30));
        System.out.println(calculator.subtract(20, 30));
        System.out.println(calculator.sum(20, 30));
        System.out.println(calculator.multiply(20, 30));

    }
}

class CalculatorClass implements Calculator {
    int value1, value2;

    public CalculatorClass(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public CalculatorClass() {
    }

    @Override
    public double sum(int val1, int val2) {
        return val1 + val2;
    }

    @Override
    public double multiply(int val1, int val2) {
        return val1 * val2;
    }

    @Override
    public double divide(int val1, int val2) {
        return (double) val1 / val2;
    }

    @Override
    public double subtract(int val1, int val2) {
        return val1 - val2;
    }
}


//1- Create 'Calculator' interface. in this interface there should be 4 functions: Sum, Subtract, Multiply, Divide.
//        implement this interface from 'CalculatorClass' and implement necessary functions.
//
//All the classes and interface and main function should be in separate files.
