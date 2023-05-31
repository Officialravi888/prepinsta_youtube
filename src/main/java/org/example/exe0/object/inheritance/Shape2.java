package org.example.exe0.object.inheritance;

public class Shape2 {
    public void area(){
        System.out.println();
    }
}
class Triangle1 extends Shape2{
    public void area(int a, int b) {
        System.out.println((1/2)*a*b);
    }
}
