/*
Question:
Print all even numbers between 1 and 100.

Output:
2 4 6 8 10 ... 100
*/

public class Q03Even1to100{
    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            if(i%2==0){
                System.out.println(i);
               
            }
         i++;
        }

    }
}