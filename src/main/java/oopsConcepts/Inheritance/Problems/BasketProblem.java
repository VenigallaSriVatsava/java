package oopsConcepts.Inheritance.Problems;

import java.util.Scanner;
public class BasketProblem {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            //   System.out.println("enter the number of baskets");
            int numberOfBaskets = 5;

            int count = 0;

            int[] basketCapacity = {11,20,15,17,34};
      /* System.out.println("each baskets capacity");
        for (int i = 0; i < numberOfBaskets; i++) {
            basketCapacity[i] = sc.nextInt();
        }*/
            System.out.println("no of apples");
            int numberOfApples = 55;
            for (int k = 0; k < numberOfBaskets; k++) {
                int remainingApples = numberOfApples % basketCapacity[k];
                if (remainingApples == 0) {
                    count++;
                } else {
                    for (int j = 0; j < numberOfBaskets; j++) {
                        if (remainingApples >= basketCapacity[j]) {
                            int remainingApples1 = remainingApples % basketCapacity[j];
                            if (remainingApples1 == 0) {
                                count++;
                                break;
                            }
                        }
                    }
                }

            }
            System.out.println("number of possible ways: " +count);
        }
    }
