package arrays;

public class SecondSmallest {

    public static void main(String[] args) {

        int arr[] = {54,3,21,72,8,66,19};
        int secondSamllestEl = findSecondSmallElement(arr);
        System.out.println("Second Smallest is: " + secondSamllestEl);
    }

    private static int findSecondSmallElement(int[] arr) {

        int smallest = arr[0];
        int ssmallest = 999;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }

        return ssmallest;
    }
}
