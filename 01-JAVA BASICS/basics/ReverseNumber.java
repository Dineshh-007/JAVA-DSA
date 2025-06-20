package basics;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 23454;
        int rev = 0;

        while (num > 0 ){
            int rem = num%10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println("The reverse of the number is " + rev);
    }
}
