package methodsinjava;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        System.out.println(IsArmstrongNumber(n));

        for(int i = 100 ; i < 1000 ; i++){
            if (IsArmstrongNumber(i)){
                System.out.println(i + " ");
            }
        }
    }
    static Boolean IsArmstrongNumber(int n){
        int original = n;
        int sum = 0;
        while( n > 0){
            int rem = n % 10;
            sum += rem * rem * rem ;
            n = n / 10;
        }
//        if (sum == original){
//            return true;
//        }
//        return false;
        // don't write these much of lines 😒
        return sum == original;
    }
}
