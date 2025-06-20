package basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fibonacci series no you want: ");
        int n = input.nextInt();
        int count = 2;
        int f = 0;
        int s = 1;
        while (count <= n){
            int temp = s;
            s = f+s;
            f = temp;
            count++;
        }
        System.out.println(s);

    }
}
