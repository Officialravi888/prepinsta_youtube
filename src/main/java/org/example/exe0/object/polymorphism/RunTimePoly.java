package org.example.exe0.object.polymorphism;

public class RunTimePoly {
    public void show(int a){
        System.out.println(":"+a);
    }
    public void show(int a, int b){
        System.out.println(":"+a+b);
    }
    public static void main(String[] args) {
        RunTimePoly obj=new RunTimePoly();
        obj.show(12);
        obj.show(23,45);
    }
}
