package arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int arr[] = {3,12,12,21,21,54,55};
        int n = arr.length;
        int size = removeDuplicates(arr, n);
        System.out.println(size);
    }

    private static int removeDuplicates(int[] arr, int n) {

        int i = 0;
        for(int j=1;j<n;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        return (i+1);
    }
}
