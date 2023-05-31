package org.example.exe1;

public class Revers_no {
    public static void main(String[] args) {
        int num=12345,revers=0;
        while (num!=0){
            int remainder=num%10;
            revers=revers*10+remainder;
            num/=10;
        }
        System.out.println(":"+revers);

    }
}
