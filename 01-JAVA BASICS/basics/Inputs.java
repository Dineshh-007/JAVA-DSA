package basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your roll no: ");
        int roll = input.nextInt();
        System.out.println("Your roll no is " + roll);
    }
}
