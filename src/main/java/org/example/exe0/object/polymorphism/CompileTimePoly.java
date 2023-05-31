package org.example.exe0.object.polymorphism;

public class CompileTimePoly {
    public void show(int a){
        System.out.println(":"+a);
    }
}
class M extends CompileTimePoly{
    public void show(int a) {
        System.out.println(":"+a);
    }
}
class M2{
    public static void main(String[] args) {
        CompileTimePoly obj=new CompileTimePoly();
        obj.show(12);
    }
}
