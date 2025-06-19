package linear_search;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 2 , 3} ,
                {4 , 5 , 6} ,
                {7 , 8 , 9}
        };
        int target = 7;
        System.out.println(search(arr , target));
    }
    public static boolean search(int[][] arr , int target){
        for(int row = 0; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length; col++ ) {
                if (arr[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
