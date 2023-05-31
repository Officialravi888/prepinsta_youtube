package org.example.exe0.object.method;

public class Instance_method {
    public static void main(String[] args) {
        Instance_method obj=new Instance_method();
        System.out.println(obj.add(12,4));
    }
    int s;
    public int add(int a, int b){
        s=a+b;
        return s;
    }
}
