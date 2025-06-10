package basics;

public class TypeCasting {
    public static void main(String[] args) {
        int num = (int)(67.36f);
        int a = 257;
        byte b = (byte)(a);  // output 257%256 == 1

        // ASCI NUMBER
        int number = 'A';

        System.out.println(num);
        System.out.println(b);
        System.out.println(number);
    }
}
