package arrays;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums); // Arrays are mutable.........
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        arr[0] = 99;
    }
}