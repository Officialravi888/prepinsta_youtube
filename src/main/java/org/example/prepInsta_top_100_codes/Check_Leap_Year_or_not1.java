package org.example.prepInsta_top_100_codes;

import java.time.Year;

public class Check_Leap_Year_or_not1 {
    public static void main(String[] args) {
        int year=2023;
        if (year%400==0||(year%4==0 && year%100!=0))
            System.out.println("leap year");
        else
            System.out.println("not leap year");
    }
}
