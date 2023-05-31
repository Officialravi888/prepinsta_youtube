package org.example.exe0.object.abstract_method;

abstract class Demo {
    abstract void display();
}
public class MyClass extends Demo{

    @Override
    void display() {
        System.out.println("Abstract Method");
    }

    public static void main(String[] args) {
        Demo obj=new MyClass();
        obj.display();
    }
}
