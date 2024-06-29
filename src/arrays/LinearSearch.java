package arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int num = 2;
        int position = searchNum(arr, n, num);
        System.out.println(position);
    }

    private static int searchNum(int[] arr, int n, int num) {

        int pos = 0;

        for(int i=0;i<n;i++){
            if(arr[i] == num){
                pos=i;
                break;
            }
        }

        return pos;
    }
}
