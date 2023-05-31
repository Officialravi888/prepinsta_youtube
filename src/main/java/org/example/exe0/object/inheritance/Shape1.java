package org.example.exe0.object.inheritance;

public class Shape1 {
    public void area(){
        System.out.println("Display area or shap");
    }
}
class Triangle extends Shape1{
    public void area(int a, int b){
        System.out.println((1/2)*a*b);
    }
}
class Circle extends Shape1 {
    public void area(int c){
        System.out.println((3.14)*c*c);
    }
}
class main{
    public static void main(String[] args) {
        Shape1 obj=new Shape1();
        obj.area();
    }
}
