// Given an integer array nums of length n, create an array ans of length 2n where ans[i] == nums[i] and ans[i+n] == nums[i] for all 0 ≤ i < n. Return ans.

// Example 1
// Input:
// nums = [1,2,1]
// Output:
// [1,2,1,1,2,1]
// Explanation:
// ans = nums + nums.
// Constraints: 1 ≤ n ≤ 1000  |  1 ≤ nums[i] ≤ 1000

import java.util.Scanner;
import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args){
        System.out.println("Program to concatenate an array!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array nums size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements in the nums array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        int ans[] = concatenation(nums, n);
        System.out.println("The Concatenated array is: " + Arrays.toString(ans));
    }

    static int[] concatenation(int[] nums, int n){
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
