package Questions;

public class RecusionBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,55,66};
        int target = 4;
        System.out.println(recusionBinarySearch(arr,target,0,arr.length-1));


    }
    static int recusionBinarySearch(int[]arr,int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(target > arr[mid]){
            return recusionBinarySearch(arr,target,mid+1,end);
        }
        return recusionBinarySearch(arr,target,start,mid-1);
    }

}
