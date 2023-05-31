package org.example.exe0.object.method;

public class User_define_method {
        public static void findEvenOdd ( int num){
            if (num % 2 == 0)
                System.out.println(num + ":is even");
            else
                System.out.println(num + ":is odd");
        }

    public static void main(String[] args) {
            findEvenOdd(12);
    }
}
