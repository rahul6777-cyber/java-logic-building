/*
Question:
Print all numbers between 1 and 100 that are divisible by 7.

Output:
7 14 21 28 ... 98
*/

public class Q23NumbersDivisibleBy7 {
    public static void main(String[] args) {
        int i=7;
      
        while(i<=100){
            if(i%7==0){
                System.out.println(i);
            }
            i++;
        }

    }
}