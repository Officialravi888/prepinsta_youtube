package org.example.prepInsta_top_100_codes;
//Input an integer input “number“
//        Check whether the number is divisible by 2 using the ternary operator
//        (number % 2) ? (cout <<“Even”) : (cout << “Odd”);
public class Even_or_Odd_Check_The_Number_Using_Ternary_Operator {
    public static void main(String[] args) {
        int number=121;
        String status=number%2==0?"Even":"odd";
        System.out.println(status);

    }
}
