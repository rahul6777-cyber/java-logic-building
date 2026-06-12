/*
Question:
Calculate the sum of all even numbers from 1 up to n.

Input:
n = 10

Output:
30
*/

public class Q07SumOfEvenNumbers {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int sum = 0;

        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println(sum);
    }
}