package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {13,64,75,24,19,2};
        bubble_sort(arr);
    }

    private static void bubble_sort(int[] arr) {

        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0; j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }

        }

        System.out.println("After bubble sort: ");
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
