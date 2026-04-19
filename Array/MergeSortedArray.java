// Problem
// Given sorted arrays nums1 (with m real elements + n zeros) and nums2 (n elements), merge them in-place into nums1 in non-decreasing order.

// Example 1
// Input:
// nums1=[1,2,3,0,0,0] m=3, nums2=[2,5,6] n=3
// Output:
// [1,2,2,3,5,6]
// Constraints: m,n≥0  |  nums1.length==m+n  |  −10⁹≤nums[i]≤10⁹

import java.util.Scanner;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Merge Sorted Array: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the " +m+ " elemenets in the array and " +n+ " zeros in the array: ");
        int[] nums1 = new int[m+n];
        for(int i = 0; i < m+n; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter the " +n+ "elements in the array: ");
        int[] nums2 = new int[n];
        for(int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        int ans[] = mergesortedarray(nums1, nums2, m, n);
        System.out.println("Merged Sorted Array: " + Arrays.toString(ans));
    }

    static int[] mergesortedarray(int[] nums1, int[] nums2, int m, int n) {
        if(m == 0) return nums2;
        int[] result = nums1;
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        for(int i = 0; i < n; i ++) {
            if(nums1[p1] >= nums2[p2]){
                int temp = nums1[p1];
                result[p1] = nums2[p2];
                p += 1;
                p1 += 1;
                result[p1] = temp;
            } else {
                result[p] = nums2[p2];
                p2 -= 1;
                p -= 1;
            }
        }
        return result;
    }
}

// nums1=[1,2,3,0,5,6] m=3, nums2=[2,,] n=3
// p1 = 2
// p2 = 0
// p = 3