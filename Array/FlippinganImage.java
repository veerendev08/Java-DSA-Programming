// Problem
// Given an n×n binary matrix image, flip each row horizontally and invert it. To flip: reverse each row. To invert: replace 0→1, 1→0 (XOR with 1).

// Example 1
// Input:
// image = [[1,1,0],[1,0,1],[0,0,0]]
// Output:
// [[1,0,0],[0,1,0],[1,1,1]]
// Explanation:
// Flip [1,1,0]→[0,1,1]→invert→[1,0,0].
// Constraints: n == image.length == image[i].length  |  1≤n≤20  |  image[i][j] ∈ {0,1}

// original array
// 1 1 0
// 1 0 1
// 0 0 0

// flip each row horizontally (reverse each row)
// 0 1 1
// 1 0 1
// 0 0 0

// replace 0-1, 1-0
// 1 0 0
// 0 1 0
// 1 1 1

import java.util.Scanner;
import java.util.Arrays;

public  class FlippinganImage {
    public static void main(String[] args) {
        System.out.println("Flipping an Image:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the value of col: ");
        int col = sc.nextInt();
        System.out.print("Enter the value in "+row+"*"+col+" array: \n");
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                System.out.print("Enter the value for arr["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] result = flipimage(arr, row, col);
        System.out.println("\nFlippinganImage:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static int[][] flipimage(int[][] arr, int row, int col) {
        // flip each row horizontally (reverse each row)\
        int[][] temp = new int[row][col];
        for(int i = 0; i < row; i++) {
            int k = 0;
            for(int j = col - 1; j > -1; j--) {
                temp[i][k] = arr[i][j] ^ 1; // XOR with 1
                k = k + 1;
            }
        }
        return temp;
    }
}
