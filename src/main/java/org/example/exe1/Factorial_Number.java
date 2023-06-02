package org.example.exe1;

public class Factorial_Number {
    static int fact(int num){
        if (num==0)
            return 1;
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        int number=5;
        System.out.println(number+""+fact(number));
        for (int i=0; i<number;i++){

        }
    }

}
