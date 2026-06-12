/*
Question:
Find and print the product of all digits of a given number.

Input:
123

Output:
6
*/

public class Q10ProductOfDigits {
    public static void main(String[] args) {
        int n=123;
        int product =1;
        while(n>0){
            int digit = n%10;  //Last digit
            product = product * digit;  
            n = n/10;  // Remove last digit
        }
        System.out.println(product);
     
    }
}