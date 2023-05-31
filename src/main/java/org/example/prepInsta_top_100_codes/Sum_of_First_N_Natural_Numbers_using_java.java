package org.example.prepInsta_top_100_codes;
//Example
//        Input : num = 5
//        Output : 15
//        Where first 8 number is 1, 2, 3, 4, 5
//        Sum of numbers = 1 + 2 + 3 + 4 + 5 = 15
//Method 1: Using for Loop
//        Method 2: Using Formula for the Sum of Nth Term
//        Method 3: Using Recursion
public class Sum_of_First_N_Natural_Numbers_using_java {
    public static void main(String[] args) {
        int number=3;
        int sum=0;
        for (int i=1; i<=number; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
