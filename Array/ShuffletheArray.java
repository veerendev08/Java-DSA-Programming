// Problem
// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn], return the array in the form [x1,y1,x2,y2,...,xn,yn].

// Example 1
// Input:
// nums = [2,5,1,3,4,7], n = 3
// Output:
// [2,3,5,4,1,7]
// Explanation:
// x=[2,5,1], y=[3,4,7]. Interleaved: [2,3,5,4,1,7].

import java.util.Scanner;
import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args){
        System.out.println("Program to shuffle the array!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int nums[] = new int[n*2];
        System.out.print("Enter the " +n+ "elements in the array:");
        for(int i = 0; i < n*2; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The Shuffled array is : " + Arrays.toString(shuffle(nums, n)));
    }

    static int[] shuffle(int[] nums, int n){
        int ans[] = new int[n*2];
        for(int i = 0; i < n; i++){
            System.out.println("Number :" + nums[i]);
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[i+n];
        }
        return ans;
    }
}
