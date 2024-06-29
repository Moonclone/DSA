package arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int arr[] = {54,3,21,72,8,66,19};
        int secondLargestEl = findSecondLarElement(arr);
        System.out.println(secondLargestEl);
    }

    private static int findSecondLarElement(int[] arr) {

        int largest = arr[0];
        int secondLargest = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] != largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
