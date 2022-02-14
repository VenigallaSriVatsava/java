package Static;

public class StaticCheck {
    public static void main(String[] args) {
        //StaticCheck obj = new StaticCheck();
        StudentDetails no1 = new StudentDetails("kiran ", " 6th august");
        StudentDetails no2 = new StudentDetails("varun ", " 10th july");

        no1.joiningDetails();
        no2.joiningDetails();
    }
}
