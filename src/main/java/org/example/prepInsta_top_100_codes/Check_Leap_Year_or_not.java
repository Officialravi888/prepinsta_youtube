package org.example.prepInsta_top_100_codes;
//Example
//        Input : 2024
//        Output: Leap Year

//Check if the year variable is divisible by 400.
//        Check if the year variable is divisible by 4 but not by 100.
//        If the above conditions are satisfied, print it’s a Leap year. It’s not a Leap Year otherwise.
public class Check_Leap_Year_or_not {
    public static void main(String[] args) {
        int number=2021;
        if (number%400==0)
            System.out.println("leap year");
        else if (number%4==0 && number%100!=0)
            System.out.println("leap year");
        else
            System.out.println("not leap year");
    }
}
