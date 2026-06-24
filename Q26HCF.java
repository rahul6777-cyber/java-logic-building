/* Question:
Find the HCF (Highest Common Factor) of two given numbers.

Input:
a = 12, b = 18

Output:
6
*/

public class Q26HCF {
    public static void main(String[] args) {
        int a=12;
        int b=18;
        int i=1;
        int hcf=1;
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
            i++;
        }
        System.out.println(hcf);

    }  
    
}