package org.example.exe2;

public class Varargs_using_add_no {
    public int sunNumber(int ... args){
        System.out.println(""+args.length);
        int sum=0;
        for (int x:args){
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        Varargs_using_add_no ex = new Varargs_using_add_no();
        int sum2 = ex.sunNumber(2, 4,9,0,7);
        System.out.println("sum2 = " + sum2);
    }
}
