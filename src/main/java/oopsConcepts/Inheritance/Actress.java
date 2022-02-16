package oopsConcepts.Inheritance;

public class Actress extends Artist {


    public static void main(String[] args) {
        Actress obj = new Actress();
        obj.name = "sanjana";
        obj.duration = 50;
        obj.remuneration = 2;
        System.out.println("actress of movie " + obj.movie + " is " + obj.name);

    }
}
