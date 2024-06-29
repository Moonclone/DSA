package sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {64,13,75,24,19,2};
        int n = arr.length;
        insertion_sort(arr,n);
    }

    private static void insertion_sort(int[] arr, int n) {

        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }

        System.out.println("After insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
