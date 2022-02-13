package oopsConcepts.aggregation;

public class Student {
    private String name;
  private   Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        obj1.setCity("delhi");
        obj1.setState("UP");
        obj.setAddress(obj1);
        obj.setName("vatsav");

        System.out.println("city = " +obj.getAddress().getCity() +obj.getAddress().getState() );
    }
}
