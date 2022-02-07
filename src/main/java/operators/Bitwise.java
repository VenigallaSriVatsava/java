package operators;

public class Bitwise {

    /*
    It performs binary operation between operands by converting decimal values to binary if in decimal type
    they will be also used the update the values.
     */

    int a = 5;
    int b = 6;
    int c;

    public int or() {
        c = a | b;
        return c;
    }

    public int and() {
        c = a & b;
        return c;
    }


    public int compliment() {   // returns one's compliment of operand
        c = ~c;
        return c;

         /*
         one's compliment means it converts binary one's into zeroes and zeroes int one's
           eg: one's compliment of 6
           binary equivalent of 6 is 0110
           1's equivalent will be :  1001
           decimal equivalent of the output is 9
     */
    }

    public int xor() {
        c = a ^ b;
        return c;

        /*
          xor means if two inputs have same value either true or false then it returns '0'
          if two inputs are different it returns '1' as output
         */
    }

    // SHIFT OPERATOR
    /*
    bitwise shift operator is used to shift the binary bits by either left or right based on the operator used.
    right shift operator shifts right side and left shift operator shifts it by left side
     */

}
