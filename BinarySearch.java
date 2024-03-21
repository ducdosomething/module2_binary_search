/**
 * BinarySearch
 */
public class BinarySearch {

    public static int binarySearch(int arr[], int left, int right, int target) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            }
            return binarySearch(arr, mid + 1, right, target);
        } else {
            return -1;
        }
    }
}