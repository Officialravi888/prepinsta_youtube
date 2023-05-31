package org.example.exe1;

public class String_revers_char {
    public static void main(String[] args) {
       String input="ravi kant kushwaha";
       char[] a=input.toCharArray();
         for (int i=a.length-1;i>=0;i--){
             System.out.println(a[i]);
         }
    }
}
