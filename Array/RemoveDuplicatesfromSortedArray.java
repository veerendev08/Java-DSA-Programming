// Problem
// Given a sorted integer array nums, remove duplicates in-place such that each unique element appears only once. Return the count of unique elements k. The first k elements of nums must hold the unique values.

// Example 1
// Input:
// nums = [1,1,2]
// Output:
// k=2, nums=[1,2,_]
// Constraints: 1 ≤ nums.length ≤ 3×10⁴  |  −100 ≤ nums[i] ≤ 100  |  Sorted

import java.util.*;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the number in the array: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicate(nums);
        System.out.println("k = " + k);
        System.out.println("Array after removing duplicates: " + Arrays.toString(nums));
        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }

    static int removeDuplicate(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] !=  nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
// ArrayList<Integer> list = new ArrayList<>();
//         System.out.println("Enter numbers (type -1 to stop):");
//         while (true) {
//             int x = sc.nextInt();
//             if (x == -1) break;   // sentinel value
//             list.add(x);
//         }
//         int[] arr = new int[list.size()];
//         for (int i = 0; i < list.size(); i++) {
//             arr[i] = list.get(i);
//         }


// System.out.println("Enter array elements separated by space:");
//         String line = sc.nextLine().trim();
//         if (line.isEmpty()) {
//             System.out.println("No input");
//             return;
//         }
//         String[] parts = line.split("\\s+");
//         int[] arr = new int[parts.length];
//         for (int i = 0; i < parts.length; i++) {
//             arr[i] = Integer.parseInt(parts[i]);
//         }