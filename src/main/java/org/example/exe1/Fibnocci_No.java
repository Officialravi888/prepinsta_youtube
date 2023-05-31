package org.example.exe1;

public class Fibnocci_No {
    public static void main(String[] args) {
        int n1=0,n2=1,n3=0;
        System.out.println(n1+":"+n2);
        for (int i=0; i<8; i++){
            n1=n2;
            n2=n3;
            n3=n1+n2;
            System.out.println(n3);
        }
    }
}
