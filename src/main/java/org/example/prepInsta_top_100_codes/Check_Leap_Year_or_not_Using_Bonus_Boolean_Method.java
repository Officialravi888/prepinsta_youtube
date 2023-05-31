package org.example.prepInsta_top_100_codes;

public class Check_Leap_Year_or_not_Using_Bonus_Boolean_Method {
    public static void main(String[] args) {
        int year = 2020;
        boolean leap;

        if (year % 400 == 0)
            leap = true;

        else if (year % 4 == 0 && year % 100 != 0)
            leap = true;

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
