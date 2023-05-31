package org.example.prepInsta_top_100_codes;
//Initialize the required variable sum = 0.
//        Define a recursive function with base case as number1 == number2.
//        Set the recursive set call as num1+ function(sum,num1+1,num2).
//        print the returned value after calling the recursive functions.
public class Sum_of_the_Numbers_in_a_Given_Range_Using_Recursion {
    public static void main(String[] args) {
        int a=2,b=5;
        int sum=getSum(0,a,b);
        System.out.println(sum);
    }
    static int getSum(int sum,int i, int b){
        if (i>b)
            return sum;
        return i+getSum(sum,i+1,b);

    }

}
