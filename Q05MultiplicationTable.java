/*
Question:
Print the multiplication table of a given number from n × 1 to n × 10.

Input:
n = 5

Output:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
*/

public class Q05MultiplicationTable {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        while(i<=10){
            System.out.println(n + "x" + i + "=" + (n*i));
            i++;
        }

    }
}