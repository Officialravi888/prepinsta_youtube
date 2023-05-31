package org.example.exe1;

public class Palindrom_Number_left_right_same {
    public static void main(String[] args) {
        int num = 202, revers = 0;
        int temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            revers = revers * 10 + remainder;
            temp /= 10;
        }
        if (num == revers) {
            System.out.println("plandrom:" + num);
        }else {
            System.out.println("not plandrom:" + num);
        }
    }
}
