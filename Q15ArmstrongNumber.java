/*
Question:
Check whether a given number is an Armstrong number or not.

Input:
153

Output:
Armstrong Number
*/

public class Q15ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int original =n;
        int sum=0;
        while(n>0){
            int digit =n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }
        if(sum==original){
            System.out.println("Armstrong Number");
            }
            else{
                System.out.println("Not Armstrong Number");
            }


    }
}