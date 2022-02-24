package Static;

public class StudentDetails {
    String name;
    int age;
    static String college = "gmr";


    StudentDetails(String n, int a) {
        name = n;
        age = a;
    }

    void joiningDetails() {

        System.out.println("Student " + name + "age is " + age + " from college " + college);
    }

}
// TODO