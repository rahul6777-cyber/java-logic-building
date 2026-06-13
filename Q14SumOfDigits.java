/*
Question:
Find and print the sum of all digits of a given number.

Input:
123

Output:
6
*/

public class Q14SumOfDigits {
    public static void main(String[] args) {
        int n=123;
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(sum);


    }
}