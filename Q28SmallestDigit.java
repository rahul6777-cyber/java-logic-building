/*
Question:
Find the smallest digit in the given number.

Input:
n = 5824

Output:
2
*/

public class Q28SmallestDigit {
    public static void main(String[] args) {
        int n=5824;
        int min=9;
        while(n>0){
            int digit=n%10;
            if(digit<min){
                min=digit;
            }
            n=n/10;
        }
        System.out.println(min);

    }
}