package Static;

public class StaticCheck {
    public static void main(String[] args) {
        //StaticCheck obj = new StaticCheck();
        StudentDetails no1 = new StudentDetails("kiran ", 19);
        StudentDetails no2 = new StudentDetails("Tarun ", 20);

        no1.joiningDetails();
        no2.joiningDetails();
    }
}
// TODO assert and check