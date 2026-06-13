/*
Question:
Print the Fibonacci series up to n terms.

Input:
n = 10

Output:
0 1 1 2 3 5 8 13 21 34
*/

  public class Q19FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;

        int a = 0, b = 1;
        int i = 1;

        while (i <= n) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;

            i++;
        }
    }
}

