package org.example.exe0.object.method;

public class Static_method {
    static void show(){
        System.out.println("it is example of static method");
    }
    public static void main(String[] args) {
        Static_method.show();
        show();
    }
}
