package arrays;

public class FindMissingNumber {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,7};
        int N = 7;
        int x = findMissingNumberOptimal(arr, N);
        System.out.println(x);
    }

    private static int findMissingNumberOptimal(int[] arr, int N) {

        int sum = (N * (N+1))/2;
        int s2 = 0;

        for(int i=0;i<arr.length;i++){
            s2+=arr[i];
        }

        int missingNum = sum-s2;
        return missingNum;
    }

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
