// Problem
// Given an integer array nums, return all triplets [nums[i], nums[j], nums[k]] such that i≠j≠k and nums[i]+nums[j]+nums[k]==0. The solution set must not contain duplicate triplets.

// Example 1
// Input:
// nums = [-1,0,1,2,-1,-4]
// Output:
// [[-1,-1,2],[-1,0,1]]
// Constraints: 3 ≤ nums.length ≤ 3000  |  −10⁵ ≤ nums[i] ≤ 10⁵
// Try Examples
// [-1,0,1,2,-1,-4]→[[-1,-1,2],[-1,0,1]]
// [0,0,0]→[[0,0,0]]
// [-2,0,1,1,2]→[[-2,0,2],[-2,1,1]]

import java.util.Scanner;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" numbers in the array: \n");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        threesumarray(nums, n);
    }
    static void threesumarray(int[] nums, int n) {
        for(int i = 0; i < n - 2; i ++) {
            for(int j = i + 1; j < n - 1; j++) {
                if((nums[i] + nums[j] + nums[j+1]) == 0) {
                    System.out.println("Array: [" +nums[i]+", "+nums[j]+" ," +nums[j+1]+"]");
                }
            }
        }
    }
}