package Tasks;

public class SmallestElementFinder {
    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        // TODO: Add code here to find the smallest element in the array
        return smallest;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6};
        System.out.println("Smallest element: " + findSmallest(array)); // Output should be 1
    }
}