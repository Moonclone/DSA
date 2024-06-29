package arrays;

public class MoveZerosToLast {

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        moveXeroestoEnd(arr, n);
    }

    private static void moveXeroestoEnd(int[] arr, int n) {

       int j=-1;
       for(int i=0;i<n;i++){
           if(arr[i] == 0){
               j=i;
               break;
           }
       }

       for(int i=j+1;i<n;i++){
           if(arr[i] != 0){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
           }
       }

        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length-1)
                System.out.print(arr[i]+"");
            else
                System.out.print(arr[i]+",");
        }
    }
}
