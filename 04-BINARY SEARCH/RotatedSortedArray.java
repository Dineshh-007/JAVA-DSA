public class RotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = {6,7,1,2,3,4,5};
        int target = 6;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr , int target){
        int pivot = searchPivot(arr);
        if (pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if( arr[pivot] == target ) {
            return pivot;
        }
        else if ( arr[0] <= target){
            return binarySearch(arr , target , 0 , pivot-1);
        }
        else{
            return binarySearch(arr , target , pivot+1,arr.length-1);
        }

    }


    static int searchPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            else if (arr[start] > arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1 ;
    }

    static int binarySearch(int[] arr , int target , int start , int end){
//        int start = 0;
//        int end = arr.length-1;
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
        return -1;
    }

//  ------------- IF THE ARRAY HAS DUPLICATES------------

//    static int findPivotWithDuplicates(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            // 4 cases over here
//            if (mid < end && arr[mid] > arr[mid + 1]) {
//                return mid;
//            }
//            if (mid > start && arr[mid] < arr[mid - 1]) {
//                return mid-1;
//            }
//
//            // if elements at middle, start, end are equal then just skip the duplicates
//            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
//                // skip the duplicates
//                // NOTE: what if these elements at start and end were the pivot??
//                // check if start is pivot
//                if (start < end && arr[start] > arr[start + 1]) {
//                    return start;
//                }
//                start++;
//
//                // check whether end is pivot
//                if (end > start && arr[end] < arr[end - 1]) {
//                    return end - 1;
//                }
//                end--;
//            }
//            // left side is sorted, so pivot should be in right
//            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
}
