package operators;

public class Relational {

    /*
    relational operators checks for relation between two operands
    they are greater-than(>),less-than(<),equals(==),greater-than or equals(>=),less-than or equals(<=)
     */

    int d = 4;
    int e = 3;
    boolean f;

    public boolean equals(int a, int b) {
        a = 9;
        b = 6;
        boolean c = (a==b);
        return c;
    }

    public boolean greaterthan(int a, int b)  {
        a = 9;
        b = 6;
        boolean c = (a>b);
        return c;
    }

    public boolean lessthan() {
        f = (d<e);
        return f;
    }

    public boolean greaterthanOrEquals() {
        f = (d>=e);
        return f;
    }

    public void lessthanOrEquals() {
        f = (d>=e);
        System.out.println(f);
    }
}
