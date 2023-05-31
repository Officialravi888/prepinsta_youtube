package org.example.prepInsta_top_100_codes;
//Method 1: Using if-else Statements 1
public class Greatest_Number_Among_Three_Numbers {
    public static void main(String[] args) {
        int a=24,b=34,c=27;
        if (a>=b && a>=c)
            System.out.println("a Greatest_Number:"+a);
        else if (b>=a && b>=c)
            System.out.println("b Greatest_Number:"+b);
        else if (c>=a && c>=b)
            System.out.println("c Greatest_Number:"+c);
    }
}
