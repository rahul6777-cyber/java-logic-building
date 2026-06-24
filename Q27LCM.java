/*
Question:
Find the LCM (Least Common Multiple) of two given numbers.

Input:
a = 12, b = 18

Output:
36
*/

public class Q27LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int max = (a > b) ? a : b;

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println(max);
                break;
            }
            max++;
        }
    }
}