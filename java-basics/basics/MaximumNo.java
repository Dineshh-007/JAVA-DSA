package basics;

import java.util.Scanner;

public class MaximumNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = Math.max( num3 , Math.max(num1 , num2 ));

        System.out.println(max);
    }
}
