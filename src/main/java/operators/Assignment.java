package operators;

public class Assignment {

    /* these are of two types simple and compound
    simple means assigns value to the variable directly eg: int a = 8;
    compound means assigns value with doing an operation using arithmetic operators eg: int a += 8;
     */

    public int equals(int a) { // simple assignment operator
        a = 8;                     // a = 8
        return a;
    }

    public int add(int a) {
        a += 7;                       // a = a + 7
        return a;
    }

    public int subtract(int a) {
        a -= 6;                       // a = a - 6
        return a;
    }

    public int multiply(int a) {
        a *= 2;                       // a = a * 2
        return a;
    }

    public float divide(int a) {
        a /= 2;                       // a = a / 2
        return a;
    }

    public int modulus(int a) {
        a %= 2;                       // a = a % 2
        return a;
    }

}
