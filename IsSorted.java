package Questions;

import java.util.Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        isSorted(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void isSorted(int[] arr) {
       boolean isAsc = true;
       boolean isDesc = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1]){
               isDesc =false;
            }else {
                isAsc = false;
            }if (!isDesc && !isAsc){
                break;
            }
        }
        if (isAsc) {
            System.out.println("Array is sorted in ascending order.");
        } else if (isDesc) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }

    }
}
