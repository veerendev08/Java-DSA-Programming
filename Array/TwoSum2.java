// Problem
// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Return their indices as [index1, index2] (1-indexed). You may not use the same element twice. Use only constant extra space.

// Example 1
// Input:
// numbers = [2,7,11,15], target = 9
// Output:
// [1,2]
// Explanation:
// numbers[1] + numbers[2] = 2 + 7 = 9.
// Example 2
// Input:
// numbers = [2,3,4], target = 6
// Output:
// [1,3]
// Constraints: 2 ≤ numbers.length ≤ 3×104; -1000 ≤ numbers[i] ≤ 1000; numbers is sorted in non-decreasing order; -1000 ≤ target ≤ 1000; The tests are generated such that there is exactly one solution.

import java.util.Scanner;
import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter "+n+" number in the array: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the tagret number: ");
        int target = sc.nextInt();
        int[] result = twosum(nums, n, target);
        System.out.println("Two Sum: : " + Arrays.toString(result));
        System.out.println(nums[result[0]]+ " + " +nums[result[1]]+ " = " + (nums[result[0]]+nums[result[1]]));
    }

    static int[] twosum(int[] nums, int n, int target) {
        int[] result = new int[2];
        for(int i = 0; i < n - 1; i++) {
            for(int j = 1; j < n; j++) {
                if((nums[i] + nums[j] == target) && i != j) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
// 2  3  4
// i
//    j