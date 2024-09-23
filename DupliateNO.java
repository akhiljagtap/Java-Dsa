package Questions;

import java.util.Arrays;

public class DupliateNO {
    public static void main(String[] args) {
        int[]arr= {5,4,6,7,3,2,1};
//        duplicate(arr);
//        System.out.println(Arrays.toString(arr));
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void duplicate(int[]arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr.length && arr[i]==arr[i-1]){
                System.out.println(arr[i]);
            }
        }
    }
    static void cyclic(int[]arr){
        int i =0 ;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
