package oopsConcepts.Inheritance;

public class Hero extends Movie{
    String name = "Suriya";
    int remuneration = 30;

    public void details() {
        System.out.println(name +"'s remuneration for " +movieName +" is " +remuneration +" crores");
    }

    public static void main(String[] args) {
        Hero obj = new Hero();
        obj.details();
    }
}
