package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {78,55,3,55,21,66};
        int start = 0;
        int end = arr.length-1;
        reverse(arr, start , end );
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int start , int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end--;
        }

    }
}
