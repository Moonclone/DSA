package arrays;

public class CheckSorted {

    public static void main(String[] args) {

        //int arr[] = {3,12,54,21,72,8,66,19};
        int arr[] = {3,12,21,54,55};
        int n = arr.length;
        boolean checkArray = checkSortedArray(arr, n);
        System.out.println(checkArray);
    }

    private static boolean checkSortedArray(int[] arr, int n) {

        int maxValue = arr[0];
        boolean result = false;

        for(int i=1;i<n;i++){
            if(arr[i]>maxValue){
                result = true;
                maxValue = arr[i];
            }
            else
                result = false;
        }

        return result;
    }
}
