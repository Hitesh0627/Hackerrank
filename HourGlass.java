package day1;

import java.util.*;

public class HourGlass {
    public static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;


        for (int k = 0; k < 16; k++) {
            int i = k / 4;
            int j = k % 4;

            int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                    + arr[i+1][j+1] +
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];

        System.out.println("Enter the 6x6 matrix:");

        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++)
                arr[i][j] = sc.nextInt();

        int result = hourglassSum(arr);
        System.out.println("Maximum Hourglass Sum: " + result);
    }
}
