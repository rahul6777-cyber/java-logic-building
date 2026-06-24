/*
Question:
Find and print the sum of all factors of the given number.

Input:
n = 12

Output:
28
*/

public class Q25SumOfFactors {
    public static void main(String[] args) {
        int n=12;
        int i=1;
        int sum=0;
        while(i<=n){
            if(n%i==0){
             sum=sum+i; 
            }
        i++;

        }
        System.out.println(sum);

    }
}