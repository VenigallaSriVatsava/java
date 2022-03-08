package problems;

public class Palindrome {

    //    public String PalindromeRecursion(String input) {
//
////        String output = "not Palindrome";
//
//         if (input.charAt(0) == input.charAt(input.length() - 1)){ // mayim
//            if (input.length() == 1) {
//                String output = "Palindrome";
//                return output;
//            } else {
//                String output = "";
//                input = PalindromeRecursion(input.substring(1, input.length() - 1));
//
//                return output;
//            }
//
//        }
//
//        else  {    //madam
//            String output = "not Palindrome";
//            return output;
//        }
//
//    }

    public boolean PalindromeRecursion(String input) {

        if (input == null) {
            throw new RuntimeException("input cannot be null");
        }
        if (input.length() <= 1) {
            return true;
        }
        
        return input.substring(input.length() - 1).equals(input.substring(0, 1)) && PalindromeRecursion(input.substring(1, input.length() - 1));


    }
}
