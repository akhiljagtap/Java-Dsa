package Questions;

import java.util.Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int[] arr ={5,3,2,1};
        twoPinter(arr);
        System.out.println(Arrays.toString(arr));
    }

    //using bubble sort
    static void reverse(int[]arr){
        int i=0;
        int j=1;
        for (i=0;i<arr.length;i++){
            for (j=1;j<arr.length;j++){
                if(arr[j]< arr[j-1]){
                    int temp =  arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;

                }
            }
        }
    }

    //using cyclic sort:
    static void usingCyclic(int[]arr){
        int i = 0;
        for ( i = 0; i < arr.length; i++) {
            int correct = arr[i]-1;
            if(arr[i]<arr.length && arr[i]!= arr[correct] && arr[i]>0){
                swap(arr,i,correct);
            }

        }
    }
    static void swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    //using two pointer:
    static void twoPinter(int[]arr){
        int start = 0 ;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
