package Questions.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 15, 17, 23, 45, 65, 68, 88 };
        int ans = binarySerach(arr, 65);
        System.out.println(ans);

    }

    static int binarySerach(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = start + 1;

            } else if (target < arr[mid]) {
                end = end - 1;

            } else {
                return mid;
            }

        }
        return -1;

    }

}
