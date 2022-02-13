package oopsConcepts.aggregationhas;

/*
   Aggregation represents 'HAS - A' relationship
   if we consider a class, and it has any variable which has variables of its own then we can create a class for that variable
   which will have a 'HAS - A' relationship.

 */
public class Student {            // let Student is the main class which consists of variables name and address
    private String name;         // here name is a general variable and address is a variable which can further have other variables
    private Address address;     // address may have variables like city and student, address will be of type Address class

    //it means Student has an address and address have some attributes of its own, hence it can be called as Aggregation.

    public String getName() { // gets the name we assigned in the set name method
        return name;
    }

    public void setName(String nameIs) { // sets name for the variable name
        this.name = nameIs;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Student obj = new Student();
        Address obj1 = new Address();
        obj1.setCity("chennai");
        obj1.setState("TN");
        obj.setAddress(obj1);
        obj.setName("surya");

        System.out.print("Student name is " +obj.getName());
        System.out.print(",he is from " +obj.getAddress().getCity() + "," +obj.getAddress().getState() );
    }
}
