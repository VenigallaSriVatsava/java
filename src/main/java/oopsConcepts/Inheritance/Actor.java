package oopsConcepts.Inheritance;

public class Actor extends Artist {

    public static void main(String[] args) {

        Actor obj = new Actor();
        obj.name = "suriya";
        obj.remuneration = 30;
        obj.duration = 100;
        System.out.println("actor of movie " + obj.movie + " is " + obj.name);
    }

}
