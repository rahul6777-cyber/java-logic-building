/*
Question:
Reverse a given number and print the result.

Input:
1234

Output:
4321
*/

public class Q12ReverseNumber {
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
          
        }
        System.out.println(rev);

    }
}