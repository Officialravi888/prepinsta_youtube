package org.example.prepInsta_top_100_codes;

//Step 1 – Start
//        Step 2 – Insert the number.
//        Step 3 – If number is equal to zero, Print Number is Zero
//        Step 4 – Else do following – (num > 0) ? cout << “Positive”: cout << “Negative”;
//        Step 5 – Stop
public class Positive_or_Negative_Using_ternary_operator {
    public static void main(String[] args) {
        int number=11;
        if (number==0){
            System.out.println("zero");
        }
        else {
            String result=number>0?"positive":"negative";
            System.out.println(result);
        }
    }
}
