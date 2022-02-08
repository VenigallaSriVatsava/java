package operators;

public class Unary {

    /*

     */


    public int unaryMinus(int a) {   // this will be used to convert positive values to negative

        return -a;
    }

    public boolean not(boolean d) { // returns opposite state of input
       return !d;
    }

    public int increment(int a) { // it is of two types
                           // a++ post increment, increments the values by 1 and assigns in next operation
       return a++;                    // ++a pre increment, increments and assigns value at same time

    }

    public int decrement(int a) {
                             // a-- similar to  post increment
                             // --a similar to pre increment
        return --a;

    }
}
