/*
Question:
Calculate and print the sum of the first n terms of the Fibonacci series.

Input:
n = 5

Output:
7
*/

public class Q20SumOfFibonacciSeries {
    public static void main(String[] args) {

        int n = 5;
        int a = 0, b = 1;
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + a;
              

            int c = a + b;
            a = b;
            b = c;

            i++;
        }

        System.out.println(sum);
    }
}