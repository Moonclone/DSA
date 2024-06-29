package arrays;

public class FindMissingNumber {

    public static void main(String[] args) {

        int arr[] = {1,2,4,5};
        int N = 5;
        int x = findMissingNumber(arr);
        System.out.println(x);
    }

    /*private static int findMissingNumberOptimal(int[] arr, int n) {

        int sum = (N * (N=1))
    }*/

    private static int findMissingNumber(int[] arr) {

        int flag = 1;
        int x = 0;

        for(int i=0;i<arr.length;i++){
            if (arr[i] != flag) {
                x = flag;
                break;
            }
            flag++;
        }

        return x;
    }
}
