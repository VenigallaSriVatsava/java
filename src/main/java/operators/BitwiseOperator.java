package operators;

public class BitwiseOperator {



        public int and(int operand1,int operand2) {

            // AND operator does general AND operation for bits at same positions of both operands, for one low input
            // output will be low

            int output = operand1 & operand2;
            return output;

        }

        public int or(int operand1, int operand2) {

            // OR operator does general OR operation for bits at same positions of both operands, for one high input
            // output will be high

            int output = operand1 | operand2;
            return output;

        }

        public int xor(int operand1, int operaand2) {

            // xor operator operation is for same inputs it gives low output and for different inputs it gives high ouput

            int output = operand1 ^ operaand2;
            return output;

        }

        public int compliment(int operand1) {

            // compliment operator does the inverse of the input, for input '1' output will be '0' and vice-versa.

            int output = ~operand1;
            return output;

        }

        public int leftShift(int operand1, int n) {

            /*
            The left shift operator shifts the bits to the left by the number of times specified. After the left shift,
            the empty space in the right is filled with 0, Another important point to note is that left shifting a number
             by one is equivalent to multiplying it by 2, or, in general, left shifting a number by n positions is
             equivalent to multiplication by 2^n.
            */

            int output = operand1 << n; // where n represents left shift by number of times
            return output;

        }

        public int rightShift(int operand1, int n) {

              /*
            The right shift operator shifts all the bits to the right. The empty space in the left side is filled
            depending the input number:
            When an input number is negative, where the leftmost bit is 1, then the empty spaces will be filled with 1
            When an input number is positive, where the leftmost bit is 0, then the empty spaces will be filled with 0
              */

            int output = operand1 >> n;
            return output;

        }

        public int zerofillRightshift(int operand1, int n) {

             /*
             This operator is very similar to the signed right shift operator.
             The only difference is that the empty spaces in the left are filled with 0 irrespective of whether the
             number is positive or negative. Therefore, the result will always be a positive integer.
             */

            int output = operand1 >>> n;
            return output;
        }
    }

