package operator;

public class AssignmentOperator {


        /*
    Assignment operators are used to assign values to variables.

    Assigns values from right side operands to left side operand

    Operator	Example	    Same As
    ---------------------------------
    =	        x = 5	    x = 5
    +=	        x += 3	    x = x + 3
    -=	        x -= 3	    x = x - 3
    *=	        x *= 3	    x = x * 3
    /=	        x /= 3	    x = x / 3
    %=	        x %= 3	    x = x % 3
    &=	        x &= 3	    x = x & 3
    |=	        x |= 3	    x = x | 3
    ^=	        x ^= 3	    x = x ^ 3
    >>=	x       >>= 3	    x = x >> 3
    <<=	x       <<= 3	    x = x << 3
    */

            public int equal(int A, int B){

                int C = A + B; // assigns A+B to C
                return C;

            }

            public int addAnd(int A, int C) {

                C += A;     // means C = C + A;
                return C;

            }

            public int subtractAnd(int A,int C) {

                C -= A;     // means C = C - A;
                return C;

            }

            public int multiplyAnd(int A, int C) {

                C *= A;     // means C = C * A;
                return C;

            }

            public int divideAnd(int A, int C) {

                C /= A;     // means C = C / A;
                return C;

            }

            public int modulusAnd(int A, int C) {

                C %= A;      // means C = C % A;
                return C;

            }

            public int leftShiftAnd(int C, int n) {

                C <<= n;    // means C = C << n;  shift by n number of times
                return C;

            }

            public int rightShiftAnd(int C, int n) {

                C >>= n;    // means C = C >> n;
                return C;

            }

            public int bitwiseAnd(int A, int C) {

                C &= A;     // means C = C & A;
                return C;

            }

            public int bitwiseOr(int A, int C) {

                C |= A;     // means C = C | A;
                return C;

            }
        }

