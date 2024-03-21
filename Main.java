import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = { 2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86 };
        int size = arr.length;
        System.out.println("Enter the number: ");
        int target = scanner.nextInt();
        int result = BinarySearch.binarySearch(arr, 0, size - 1, target);
        if (result == -1) {
            System.out.println("Element does not exist!");
        } else {
            System.out.println("Element found at index = " + result);
        }

        scanner.close();
    }
}
