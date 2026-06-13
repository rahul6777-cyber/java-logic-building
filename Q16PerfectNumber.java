/*
Question:
Check whether a given number is a Perfect Number or not.

Input:
28

Output:
Perfect Number
*/

public class Q16PerfectNumber {
    public static void main(String[] args) {
        int n =28;
        int sum =0;
        int i=1;
        while(i<n){
            if (n%i==0){
                sum = sum+i;
            }
            i++;
        }
        if(sum ==n){
         System.out.println("Prefect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }

    }
}