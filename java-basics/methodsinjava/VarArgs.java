package methodsinjava;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        array(23,54,56,67,76,43,56,78,32);
    }
    static void array(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
