package operator;

public class RelationalOperator {

    // initializing variables //

    public boolean equals(int a, int b) {

        // checks for equality condition //

        boolean output = ( a == b );
        return output;
    }

    public boolean notequal(int a, int b) {

        // checks for inequality //

        boolean output = ( a != b );
        return output;
    }

    public boolean greaterthan(int a, int b) {

        // checks if greaterthan condition //

        boolean output = ( a > b );
        return output;
    }

    public boolean lesserthan(int a, int b) {

        // checks for lesserthan condition //

        boolean output = ( a < b );
        return output;
    }

    public boolean greaterthanorequal(int a, int b) {
        boolean output = ( a >= b );
        return output;
    }

    public boolean lesserthanorequal(int a, int b) {
        boolean output = ( a <= b );
        return output;
    }

}