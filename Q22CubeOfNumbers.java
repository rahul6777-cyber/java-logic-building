/*
Question:
Print the cubes of numbers from 1 to n.

Input:
n = 5

Output:
1 8 27 64 125
*/

public class Q22CubeOfNumbers {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while(i<=n){
            System.out.println(i*i*i);
            i++;
        }

    }
}