package CodeUnderstanding;

// 1. Explain the Code
// 2. Are there issues in the Code?
// 3. Suggest improvements
public class MagicClassTwo {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int targetSum = 15;
        boolean result = findPairWithSum(numbers, targetSum);
        System.out.println("Pair found: " + result);
    }

    public static boolean findPairWithSum(int[] numbers, int targetSum) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println("Pair: (" + numbers[i] + ", " + numbers[j] + ")");
                    return true;
                }
            }
        }
        return false;
    }
}
