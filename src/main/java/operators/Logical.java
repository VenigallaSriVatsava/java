package operators;

public class Logical {

    /*
    these operators are same as gates in digital electronics
    these are AND,OR,NOT

       AND    &&                     OR   ||                       NOT  !
    opr1  opr2  output           opr1  opr2  output             opr1   output
       0     0       0              0     0       0                0        1
       0     1       0              0     1       1                1        0
       1     0       0              1     0       1
       1     1       1              1     1       1

       consider 0 and 1 as false and true outputs for given conditions
     */

    public boolean and(boolean a,boolean b) {
        return a && b;
    }

    public boolean or(boolean a,boolean b) {
        return a || b;
    }

    public boolean not(boolean a) {
        return !a;
    }
}
