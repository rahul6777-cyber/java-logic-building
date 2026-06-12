/*
Question:
Calculate and print the factorial of a given number.

Input:
n = 5

Output:
120
*/

public class Q09Factorial {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int fact=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
          System.out.println(fact);
    }
}