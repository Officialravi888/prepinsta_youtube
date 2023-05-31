package org.example.exe1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicat_no_delete {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 4, 6, 8, 9, 5, 4};
        Set<Integer> set = new HashSet<>(Arrays.asList(num));
        for (Integer single:set){
            System.out.print(":"+single);
        }
    }
}
