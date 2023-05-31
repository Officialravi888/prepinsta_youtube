package org.example.exe0.object;

public class Encapsulation {
    private String name;
    private int id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Encapsulation(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

}
class M1{
    public static void main(String[] args) {
        Encapsulation encapsulation=new Encapsulation("Tom",12,34);
        System.out.print("Name:"+encapsulation.getName()+"   Id:"+encapsulation.getId()+"   Age:"+encapsulation.getAge());
    }
}
