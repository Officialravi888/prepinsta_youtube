package org.example.prepInsta_top_100_codes;

public class Sum_of_digits_of_a_number_Using_ACSII_Table {
    public static void main(String[] args) {
        String num="12345687900876";
        System.out.println(":"+getSum(num));
    }
    static int getSum(String num){
        int sum=0;
        for(int i=0; i<num.length(); i++){
            sum=sum+num.charAt(i) -48;
        }
        return sum;
    }
}
