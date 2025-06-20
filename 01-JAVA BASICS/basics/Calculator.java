package basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        boolean do_it = true;
        while (do_it){
            System.out.println("Enter the operation you want to do: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    ans = num1 / num2;
                } else {
                    ans = num1 % num2;
                }
                System.out.println(ans);
            }
            else if (op == 'X' || op == 'x'){
                do_it = false;
                break;
            }
            else{
                System.out.println("Enter a valid operation");
            }
        }
    }
}
