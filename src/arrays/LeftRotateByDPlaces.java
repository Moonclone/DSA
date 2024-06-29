package arrays;

public class LeftRotateByDPlaces {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int d= 4;
        leftRotateByDPlaces(arr,n,d);
    }

    private static void leftRotateByDPlaces(int[] arr, int n, int d) {

        if (n == 0)
            return;
        int noOfRotation = d % n;
        int temp[] = new int[noOfRotation];
        for(int i=0;i<n-d;i++){
            temp[i] = arr[i];
        }

        for(int i=n-d;i<n;i++){
            arr[i-d] = arr[i];
        }

        for(int i=(n-d);i<n;i++){
            arr[i] = temp[i-(n-d)];
        }

        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length-1)
                System.out.print(arr[i]+"");
            else
                System.out.print(arr[i]+",");
        }
    }
}
