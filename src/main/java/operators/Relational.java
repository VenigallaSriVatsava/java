package operators;

public class Relational {

    /*
    relational operators checks for relation between two operands
    they are greater-than(>),less-than(<),equals(==),greater-than or equals(>=),less-than or equals(<=)
     */




    public boolean equals(int a, int b) {
        return (a==b);

    }

    public boolean greaterthan(int a, int b)  {

        return (a>b);

    }

    public boolean lessthan(int a,int b) {
        return (a<b);

    }

    public boolean greaterthanOrEquals(int a,int b) {
        return (a>=b);
    }

    public boolean lessthanOrEquals(int a,int b) {
       return (a<=b);
    }
}
