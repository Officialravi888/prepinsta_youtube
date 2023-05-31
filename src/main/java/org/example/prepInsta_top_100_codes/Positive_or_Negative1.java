package org.example.prepInsta_top_100_codes;
//Step 1 – Start
//        Step 2 – Insert the number.
//        Step 3 – If the number is greater or equal move to the inner nested loop
//        Step 3.1 – If the number is zero, print Zero
//        Step 3.2 – Else print The Number is Positive
//        Step 4 – Else the number has to be negative, Print The number is Negative
//        Step 5 – Stop
public class Positive_or_Negative1 {
    public static void main(String[] args) {
        int num=0;
        if (num>=0){
            if (num==0)
                System.out.println("zero");
            else
                System.out.println("positive");
        }else {
            System.out.println("negative");
        }
    }
}
