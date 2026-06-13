/*
Question:
Check whether a given number is a palindrome or not.

Input:
121

Output:
Palindrome
*/

public class Q13PalindromeNumber {
    public static void main(String[] args) {
        int n =121;
        int original=n;
        int rev=0;
        while(n>0){
            int digit =n%10;
            rev=rev*10+digit;
            n=n/10;
            }
            if(rev==original){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
            System.out.println(rev);


        
        

    }
}