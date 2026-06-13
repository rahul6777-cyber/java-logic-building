/*
Question:
Print all prime numbers between 1 and 100.

Output:
2 3 5 7 11 ... 97
*/

public class Q17PrimeNumbers1To100 {
    public static void main(String[] args) {
         int num = 2;

        while (num <= 100) {
            boolean isPrime = true;
            int i = 2;

            while (i * i <= num) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.print(num +" ");
            }

            num++;
        }
    }
}
       
        



