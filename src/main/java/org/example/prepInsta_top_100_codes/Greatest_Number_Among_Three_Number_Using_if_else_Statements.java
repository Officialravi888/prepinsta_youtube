package org.example.prepInsta_top_100_codes;

public class Greatest_Number_Among_Three_Number_Using_if_else_Statements {
    public static void main(String[] args) {
        int a=3,b=5,c=6;
        if (a>=b && a>=c)
            System.out.println("Greatest_Number:"+a);
        else if (b>=a && b>=c)
        System.out.println("Greatest_Number:"+b);
        else
            System.out.println("Greatest_Number:"+c);
    }
}
