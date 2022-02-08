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

    public int increment(int a,int b) { // it is of two types
        b = a++;             //  post increment, increments the values by 1 and assigns in next operation
       int c = ++a;            //  pre increment, increments and assigns value at same time
        return b;
    }

    public int decrement(int a,int c) {
                             // a-- similar to  post increment
                             // --a similar to pre increment
        return --a;

    }
}
