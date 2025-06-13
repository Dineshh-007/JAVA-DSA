package methodsinjava;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = inputs.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while ( c * c <=n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c >= n;
    }


}
