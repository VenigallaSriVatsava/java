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

    public boolean evenAndPrime(int a) {
        boolean even = (a%2==0);
        boolean prime = true;
        if(a==1 || a==0) {
            prime = false;
        }
        for(int i = 2; i<=a/2; i++) {
            if(a%i == 0) {
                prime = false;
            }
        }

            return even && prime;
    }

    public boolean evenOrPrime(int a) {
        boolean even = (a%2==0);
        boolean prime = true;
        if(a==1 || a==0) {
            prime = false;
        }
        for(int i = 2; i<=a/2; i++) {
            if(a%i == 0) {
                prime = false;
            }
        }

        return even || prime;
    }

    public boolean not(int a) {
        boolean even = false;
        if(a%2==0) {
            even = true;
        }
        return !even;
    }
}
