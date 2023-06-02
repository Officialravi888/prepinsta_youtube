package org.example.prepInsta_top_100_codes;

public class Sum_of_digits_of_a_number_Using_Recursion {
    static int getSum(int num){
        if (num==0)
            return 0;
        return (num%10)+getSum(num/10);
    }
    public static void main(String[] args) {
        int number=12345;
        System.out.println(getSum(number));
    }
}
