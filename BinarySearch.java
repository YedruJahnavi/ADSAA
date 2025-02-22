import java.util.Scanner;
import java.util.Arrays;  
public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) /2;
            if (arr[mid] == key) {
                return mid;  // Return the index if found
            }
            if (arr[mid] > key) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;  // Return -1 if not found
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr); 
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Enter the element to search for:");
        int key = scanner.nextInt();
        int result = binarySearch(arr, key); 
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + result);
        }

        scanner.close();
    }
}
