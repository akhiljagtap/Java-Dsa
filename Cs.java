package Questions;

import java.util.Arrays;

public class Cs {
    public static void main(String[] args) {
        int[] arr = {8,6,2,1}; // Example input
        cs(arr);
        System.out.println(Arrays.toString(arr)); // Output the sorted array
    }

    static void cs(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
