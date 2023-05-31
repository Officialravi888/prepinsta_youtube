package org.example.exe1;

import java.util.Arrays;

public class Array_number_count {
    public static void main(String[] args) {
    int arr[] = {1, 33, 5, 6, 8, 9, 4, 0};
    int sum = (int)Arrays.stream(arr).count();
        System.out.println("count no:"+sum);
    }
}
