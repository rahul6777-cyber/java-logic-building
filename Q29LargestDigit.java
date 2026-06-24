/*
Question:
Find the largest digit in the given number.

Input:
n = 5824

Output:
8
*/

public class Q29LargestDigit {
    public static void main(String[] args) {
        int n =5824;
        int max =0;
        while(n>0){
            int digit =n%10;
            if (digit>max){
                max=digit;
            }
            n=n/10;
        }
        System.out.println(max);
    }
}