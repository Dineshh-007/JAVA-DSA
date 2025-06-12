package methodsinjava;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int a = sum();
        System.out.println(a);
    }
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hii");
        int num1 , num2, sum;
        num1 = input.nextInt();
        num2 = input.nextInt();
        sum = num1 + num2;
        return sum;
    }
}
