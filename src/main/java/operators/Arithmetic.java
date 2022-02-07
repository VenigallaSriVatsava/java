package operators;

public class Arithmetic {

    // it is simple addition operation using '+'
    public int sum(int a, int b) {  // where a and b are operands
        return a + b;
    }

    public int subtraction(int a, int b) { // subtracts two operands, operator is '-'
        return a - b;
    }

    public int multiply(int a, int b) { //multiplies two operands, operator is '*'
        return a * b;
    }

    public float divide(int a, int b) { // divides two operands, operator is '/'
        return a / b;
    }

    public int modulus(int a, int b) {  // gives remainder when two operands are divided, operator is '%'
        return a % b;
    }

}
