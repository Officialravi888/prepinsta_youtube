package org.example.prepInsta_top_100_codes;

public class Sum_of_digits_of_a_number {
    public static void main(String[] args) {
        int num=12345,sum=0;
        while (num!=0) {
            sum += num % 10;
            num = num / 10;
        }
            System.out.println(""+sum);

    }
}
