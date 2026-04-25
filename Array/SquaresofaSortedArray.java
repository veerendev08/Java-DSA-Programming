// Problem
// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

// Example 1
// Input:
// nums = [-4,-1,0,3,10]
// Output:
// [0,1,9,16,100]
// Explanation:
// After squaring: [16,1,0,9,100]. After sorting: [0,1,9,16,100].
// Constraints: 1 ≤ nums.length ≤ 10⁴  |  −10⁴ ≤ nums[i] ≤ 10⁴  |  Sorted
import java.util.Scanner;
import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the " +n+ "number is the array: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = squareArray(nums, n);
        System.out.println("Squared sorted array: " + Arrays.toString(result));
    }

    static int[] squareArray(int[] nums, int n) {
        int[] result = new int[n];
        int temp = 0;
        for(int i = 0; i < n; i++) {
            result[i] = nums[i]*nums[i];
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(result[i] > result[j]) {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}
