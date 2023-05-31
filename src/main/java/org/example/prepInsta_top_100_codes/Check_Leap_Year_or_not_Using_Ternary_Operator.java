package org.example.prepInsta_top_100_codes;

public class Check_Leap_Year_or_not_Using_Ternary_Operator {
    public static void main(String[] args) {
        int year=2025;
        int flag=(year%400==0) || (year%4==0 && year%100!=0)?1:0;
        if (flag==1)
            System.out.println("leap year");
        else
            System.out.println("not leap year");
    }
}
