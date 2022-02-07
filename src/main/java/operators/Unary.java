package operators;

public class Unary {

    /*

     */

    int a = 10;
    int b = 12;
    int c;
    public int unaryMinus() {   // this will be used to convert positive values to negative
        a = -b;
        return a;
    }

    public boolean not(boolean c,boolean d) { // returns opposite state of input
        d = !c;
        return d;
    }

    public int increment() { // it is of two types
        b = a++;             //  post increment, increments the values by 1 and assigns in next operation
        c = ++a;             //  pre increment, increments and assigns value at same time
        return b;
       // return c;
    }

    public int decrement() {
        b = a--;             // similar to  post increment
        c = --a;             // similar to pre increment
        return b;
     //   return c;
    }
}
