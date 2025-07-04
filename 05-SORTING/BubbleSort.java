import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3 , 4 , 2 , 1 , 6 , 10, 5};
        Bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubblesort(int[] arr){
        for ( int i = 0 ; i < arr.length  ; i++){
            boolean swapped = false;
            for(int j = 0;  j < arr.length - i - 1 ; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }

    }
}
