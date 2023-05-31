package org.example.exe0.object;

public class Student {
    String name;
    int age;
    public void getInfo(){
        System.out.println(":"+this.name);
        System.out.println(":"+this.age);
    }

    public static void main(String[] args) {
        Student obj=new Student();
        obj.name="tom";
        obj.age=24;
        obj.getInfo();

    }
}
