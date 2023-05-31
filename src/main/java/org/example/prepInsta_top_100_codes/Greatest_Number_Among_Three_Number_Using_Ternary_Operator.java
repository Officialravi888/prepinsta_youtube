package org.example.prepInsta_top_100_codes;

public class Greatest_Number_Among_Three_Number_Using_Ternary_Operator {
    public static void main(String[] args) {
        int a=7,b=3,c=6;
        int temp=0;
        temp=a>b?a:b;
        int result=temp>c?temp:c;
        System.out.println(result);
    }
}
