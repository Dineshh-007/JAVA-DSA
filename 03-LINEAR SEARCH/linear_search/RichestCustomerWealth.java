package linear_search;

public class RichestCustomerWealth {
    static int richest(int[][] arr){
        int count = Integer.MIN_VALUE;
        for(int row = 0 ; row < arr.length ; row++){
            int sum = 0;
            for(int col = 0 ; col < arr[row].length ; col++ ){
                sum += arr[row][col];
            }
            if(count < sum ){
                count = sum;
            }
        }
        return count;
    }
}
