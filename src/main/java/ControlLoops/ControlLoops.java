package ControlLoops;

import models.Student;

public class ControlLoops {

    public static void main(String[] args) {


       /* IF LOOP
           if(condition)
    Statement1;
           else
    Statement2;
               */
        // example
        int a = 9;
        int b = 8;

        if (a > b)
            System.out.println(a+ " > "+b);
        else {
            System.out.println("a>b");
        }

    /* NESTED IF
       if(conditionA1) {
          if(conditionA11) {
              Statement1; }

          else(conditionA12) {
              Statement2; }

      else(conditionB1) {
          Statement3; }
          */
      String firstName = "";
      Student student1 = new Student();
        int i = 1;
        int j = 5;
        int k = 7;
        int c = 20;
        if (i == 10) {
            if (j == 20) {
                a = b;
            }
            if (j > 20) {
                a = c;
            } else {
                a = b + c;
            }
        } else {
            c = b;
        }

    /* IF-ELSE-IF LADDER
       if(condition) {
       Statement1; }
       elseif(condition2) {
       Statement2; }
       elseif(condition3) {
       Statement3; }
       ...
        ...
        ...
        else {
        StatementN; }
     */

        if (a == 1) {
            System.out.println("one");
        } else if (a == 2) {
            System.out.println("two");
        } else {
            System.out.println("n");
        }

    /* SWITCH
     switch(expression) {
     case value1;
     statement;
     break;
     case value2;
     statement;
     break;
     ..
     ..
     case valueN;
     statement;
     break;
     default:
     default statement
     */

        // example

        for(int m=0; m<=2; m++)
            switch (m) {
                case 0:
                System.out.println("m is zero");
                break;
                case 1:
                System.out.println("m is one");
                break;
                case 2:
                System.out.println("m is two");
                break;
                default:        // it is used if all cases are not satisfied
                    System.out.println("m is greater than two");
        }











    }

}

