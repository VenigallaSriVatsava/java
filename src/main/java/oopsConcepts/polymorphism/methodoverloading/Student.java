package oopsConcepts.polymorphism.methodoverloading;

public class Student {
     private String firstName;
     private String lastName;

    public void setName(String fn,String ln) {
        firstName = fn;
        lastName = ln;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
        this.lastName = "N/A";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String address(String kovvur, String AndhraPradesh) {
        return (kovvur + AndhraPradesh);
    }

    public int age(int x) {

        return x;
    }

    public int age(int x,int h) {

        return (x-h);
    }

 //   public String ContactDetails(String mobileNo:6302044444) {
   //     return mobileNo;
    //}

    public String fullName(String Venigalla,String Sri,String Vatsava) {
        return (Venigalla + Sri +Vatsava);
    }

    private String fullName() {
        return null;
    }


    public static void main(String[] args) {

        Student name = new Student();
        System.out.println(name.fullName());
        System.out.println(name.age(21));
        System.out.println(name.age(25,4));
    }


}
