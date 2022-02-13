package operators;

public class Bitwise {

    /*
    It performs binary operation between operands by converting decimal values to binary if in decimal type
    they will be also used the update the values.
     */



    public int or(int a,int b) {
        return a | b;
    }

    public int and(int a,int b) {
        return a & b;
    }


   public int compliment(int a) {   // returns one's compliment of operand
       return ~a;
   }
         /*
         one's compliment means it adds binary one to the input
           eg: one's compliment of 6
           binary equivalent of 6 is 0110
           1's equivalent will be :  0001
           decimal equivalent of the output is 7
           and it adds minus sign infront
     */


    public int xor(int a,int b) {
        return a ^ b;
    }
        /*
          xor means if two inputs have same value either true or false then it returns '0'
          if two inputs are different it returns '1' as output
         */

}
