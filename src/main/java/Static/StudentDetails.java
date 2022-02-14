package Static;

public class StudentDetails {
    String name;
    String joiningDate;
   static int joiningYear = 2022;



    StudentDetails(String n,String j){
       name = n;
       joiningDate = j;
    }

    void joiningDetails() {

        System.out.println("Student " +name +"joined in" +joiningDate +"," +joiningYear);
    }

}
