package arrays;

public class LargestElement {

    public static void main(String[] args) {

        int arr[] = {54,3,21,72,8,66,19};
        int largestEl = findLarElement(arr);
        System.out.println(largestEl);
    }

    private static int findLarElement(int[] arr) {

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max = arr[i];
        }

        return max;
    }
}
