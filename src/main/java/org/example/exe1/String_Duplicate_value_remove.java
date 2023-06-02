package org.example.exe1;

public class String_Duplicate_value_remove {
    static String temp="";
    public static void stringValue(String str){
        int length=str.length();
        for (int i=0; i<length; i++){
            if (str.charAt(i) != ' '){
                char name=str.charAt(i);
                temp+=name;
                str=str.replace(str.charAt(i),' ');
            }
        }
    }
    public static void main(String[] args) {
        stringValue("RaviKant");
        System.out.println(temp);
    }
}
