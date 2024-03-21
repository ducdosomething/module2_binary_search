package BinarySearchNoRecursion;

import java.util.Scanner;

public class BinarySearchNoRecursionTest {
    public static void main(String[] args) {
        BinarySearchNoRecursion bSObject = new BinarySearchNoRecursion();
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86 };
        System.out.println("Enter the number: ");
        int target = scanner.nextInt();
        int result = bSObject.binarySearchNoRecursion(arr, target);

        if (result == -1) {
            System.out.println("Element does not exist!");
        } else {
            System.out.println("Found element at index = " + result);
        }

        scanner.close();
    }
}
