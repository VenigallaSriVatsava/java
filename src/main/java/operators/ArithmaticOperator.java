package operators;

public class ArithmaticOperator {


    //intializing variables//

    int sum;
    int difference;
    int product;
    int division;
    int modulus;
    int increment;
    int decrement;

    // end of variables //

    // intializing methods //

    public int add(int number1, int number2) {
        sum = number1 + number2;
        return sum;
    }

    public int subtract(int number1, int number2) {
        difference = number1 - number2;
        return difference;
    }

    public int multiply(int number1, int number2) {
        product = number1*number2;
        return product;
    }

    public int divide(int number1, int number2) {
        division = number1/number2;
        return division;
    }

    public int modulo(int number1,int number2) {
        modulus = number1%number2;
        return modulus;
    }

    public int incrementation(int number1) {   // a++ --> returns value first then increments //
        increment = number1++;                 // ++a --> increments first then returns the value //
        return increment;
    }

    public int decrementation(int number1) {   // b-- --> returns the value first then decrements //
        decrement = number1--;                 // --b --> decrements the value first then retunrs the value //
        return decrement;

    }


}
