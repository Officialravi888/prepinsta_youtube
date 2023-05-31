package org.example.prepInsta_top_100_codes;
//Define a Recursive function getSum() which takes the number input as an argument.
//        Recursively call the function and keep on adding the return statements.
//        In the main() function initialize the required variables.
//        Call the Recursive function and print out the returned value.
public class Sum_of_First_N_Natural_Numbers_using_java_Using_Recursion {
    public static void main(String[] args) {
        int number=3;
        int sum=getSum(number);
        System.out.println(sum);
    }
    static int getSum(int number){
        if (number==0)
            return number;
        return number+getSum(number-1);

    }
}
