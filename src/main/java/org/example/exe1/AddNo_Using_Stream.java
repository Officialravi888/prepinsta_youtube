package org.example.exe1;
import java.util.Arrays;
public class AddNo_Using_Stream {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
