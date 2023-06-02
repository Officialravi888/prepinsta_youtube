package org.example.prepInsta_top_100_codes;

public class Sum_of_digits_of_a_number1 {
    static int getSum(int num, int sum){
        if (num==0)
            return sum;
        sum+=num%10;
        return getSum(num / 10, sum);
    }
    public static void main(String[] args) {
        int num=12345,sum=0;
        System.out.println ("Sum of digits : " + getSum (num, sum));

    }

}
