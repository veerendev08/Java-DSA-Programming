// Problem
// Given an array nums, define its running sum as runningSum[i] = sum(nums[0]…nums[i]). Return the running sum of nums.

// Example 1
// Input:
// nums = [1,2,3,4]
// Output:
// [1,3,6,10]
// Explanation:
// Running sum: 1, 1+2=3, 1+2+3=6, 1+2+3+4=10.

import java.util.Scanner;
import java.util.Arrays;

public class RunningSumof1DArray {
    public static void main(String[] args){
        System.out.println("Running Sum of 1D Array!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array nums size:");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.print("Enter the elements in the nums array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans[] = runningSum(nums, n);
        System.out.println("The Running Sum of the array is: " + Arrays.toString(ans));
    }

    static int[] runningSum(int[] nums, int n){
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum += nums[j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
