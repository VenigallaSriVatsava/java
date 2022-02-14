package oopsConcepts.Inheritance;

public class Director extends Movie {
    String name = "vatsav";
    int salary;

    public void details(){
        System.out.println("director of " +movieName +" is " +name);
    }

    public static void main(String[] args) {
        Director obj = new Director();
        obj.details();

    }
}
