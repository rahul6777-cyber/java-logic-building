/*
Question:
Print all factors of the given number.

Input:
n = 12

Output:
1 2 3 4 6 12
*/
public class Q24PrintFactors{
     public static void main(String[] args) {
        int n =12;
        int i=1;
        while(i<=n){
            if(n%i==0){
                System.out.println(i + " ");
            }
            i++;
        }

    }  
}