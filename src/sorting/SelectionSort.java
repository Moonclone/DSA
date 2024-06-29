package sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {13,46,57,42,91,8};
        selection_sort(arr);
    }

    private static void selection_sort(int[] arr) {

        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int min = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
