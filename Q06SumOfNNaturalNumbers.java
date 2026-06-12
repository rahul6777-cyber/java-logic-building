/*
Question:
Calculate and print the sum of the first n natural numbers.

Input:
n = 5

Output:
15
*/

public class Q06SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int Sum = 0;
        while(i<=n){
            Sum = Sum +i;
            i++;
            
        }
        System.out.println(Sum);

    }
}