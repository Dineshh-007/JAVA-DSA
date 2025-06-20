
/*
Ceiling of a Number ----->  Smallest Number which is greater than the target element....(also equal)💀


floor of a Number ----->  Greatest Number which is smaller than the target element....

 */



public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 17;
        int ans = search(arr , target );
        System.out.println(ans);
    }
    static int search(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        if (target > arr[arr.length-1]){
            return -1;
        }
        while( start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid+1;
            }
            else if (arr[mid] > target) {
                end = mid -1;

            }
            else if  (arr[mid] == target){
                return mid;
            }
        }
        return arr[start];
    }
}