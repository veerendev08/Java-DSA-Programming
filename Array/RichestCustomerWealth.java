// Problem
// You are given an m×n integer grid accounts where accounts[i][j] is the amount the i-th customer has in the j-th bank. Return the wealth of the richest customer (max row sum).

// Example 1
// Input:
// accounts = [[1,2,3],[3,2,1]]
// Output:
// 6
// Explanation:
// Both customers have wealth 6.

import java.util.Scanner;
import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args){
        System.out.println("Program to find the richest customer wealth!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();

        System.out.print("Enter the number of columns:");
        int m = sc.nextInt();

        int accounts[][] = new int[n][m];
        System.out.print("Enter the elements in the accounts array:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Enter the element at row " +i+ "Coloumn" +j+ ":");
                accounts[i][j] = sc.nextInt();
            }
        }
        int ans = richestCustomerWealth(accounts, n, m);
        System.out.println("Richest Customer Wealth is: " + ans);
    }

    static int richestCustomerWealth(int[][] accounts, int n, int m){
        int max = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += accounts[i][j];
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}