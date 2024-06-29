package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofTwoArrays {

    public static void main(String[] args) {

        int arr1[] = {1,2,2,3,5,6,7};
        int arr2[] = {1,3,4,5,6,7};

        int intersection[] = interofTwoArrays(arr1,arr2);

        System.out.print("The result is:  ");

        for(int num: intersection){
            System.out.print(num + " ");
        }
    }

    private static int[] interofTwoArrays(int[] arr1, int[] arr2) {

        List<Integer> intersectionList = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                intersectionList.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }

        int[] intersection = new int[intersectionList.size()];
        for(int n=0;n<intersectionList.size();n++){
            intersection[n] = intersectionList.get(n);
        }

        return intersection;
    }
}
