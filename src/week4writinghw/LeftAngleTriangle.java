package week4writinghw;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 */

public class LeftAngleTriangle {
    public static void leftAngle(int x) {
        int i, j;
        for(i =1;i <=x;i++)
    {
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

}
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print(" Enter number of row:");
        int a = scanner.nextInt();
        leftAngle(a);
        scanner.close();
    }
}
