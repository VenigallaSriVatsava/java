package operators;

public class LogicalOperator {

    // In logical operators consider two operands with boolean values true and false means a=1,b=0 //


    // declaring methods //

    public boolean and ( boolean a, boolean b){

        // '&&' is And operator, if both values are true then this operator gives output as true //

        boolean output = a && b;
        return output;                                // returns output false //
    }

    public boolean or ( boolean a, boolean b){

        // '||' is Or operator, if any one value is  true then this operator gives output as true //

        boolean output = a || b;
        return output;                                // returns output true //
    }

    public boolean not ( boolean a, boolean b){

        // ! is not operator , if reverses the output of a condition //

        boolean output = !(a && b);                   // returns reverse output, hence output is true //
        return output;
    }

}
