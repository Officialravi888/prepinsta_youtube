package org.example.exe1;

import java.util.Arrays;

public class Duplicate_no_delete {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 8, 9,4,1, 5};
      int [] uniquearr =new int[arr.length];
      int counter=0;
        //Arrays.sort(arr);
        for (int i=0; i< arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                uniquearr[counter]=arr[i];
                counter++;
            }
       }
        uniquearr[counter]=arr[arr.length-1];
        for (int i=0; i<=counter;i++){
            System.out.print(uniquearr[i]);
        }
    }
}
