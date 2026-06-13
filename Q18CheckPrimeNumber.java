/*
Question:
Check whether a given number is prime or not.

Input:
13

Output:
Prime Number
*/

public class Q18CheckPrimeNumber {
    public static void main(String[] args) {

        int n = 13;
        boolean isPrime = true;
        int i = 2;

        if (n <= 1) {
            isPrime = false;
        }

        while (i * i <= n) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}