/*
Question:
Count and print the number of digits in a given number.

Input:
12345

Output:
5
*/

public class Q11CountDigits {
    public static void main(String[] args) {
        int n=12345;
        int count=0;
        while(n>0){
           n=n/10;
            count++;
        }
        System.out.println(count);

    }
}