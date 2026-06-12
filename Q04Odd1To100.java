/*
Question:
Print all odd numbers between 1 and 100.

Output:
1 3 5 7 ... 99
*/

public class Q04Odd1To100 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=100){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;

        }

    }
}