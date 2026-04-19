// Problem
// Given an integer array nums, return the number with the smallest absolute value. If there is a tie, return the positive number.

// Example 1
// Input:
// nums = [-4,-2,1,4,8]
// Output:
// 1
// Explanation:
// |1|=1 is smallest.
// Example 2
// Input:
// nums = [2,-1,1]
// Output:
// 1
// Explanation:
// |-1|=|1|=1 (tie) → return positive: 1.
// Constraints: 1 ≤ nums.length ≤ 1000  |  −10⁵ ≤ nums[i] ≤ 10⁵

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class FindClosestNumbertoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the array input: ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findclosest(arr, n);
        System.out.println("Closest Number to Zero: " +ans);
    }

    static int findclosest(int[] arr, int n){
        int close = Math.abs(arr[0]);
        for(int i = 0; i < n; i++){
            int res = Math.abs(arr[i]);
            if((res - close) < close){
                close = res;
            }
        }
        return close;
    }
}