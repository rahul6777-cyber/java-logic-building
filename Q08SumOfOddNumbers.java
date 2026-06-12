/*
Question:
Calculate the sum of all odd numbers from 1 up to n.

Input:
n = 10

Output:
25
*/

public class Q08SumOfOddNumbers {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        int sum=0;
        while(i<=n){
            if(i%2!=0){
                sum =sum+i;

            }
            i++;
        }
        System.out.println(sum);

    }
}