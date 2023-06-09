package week4writinghw;

import java.util.Scanner;

/** Display right angle triangle of @ using nested for loops
        * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class SymbolTriangle {
    public static void symbol(int n ){
        for(int i = 0; i <= n; i++){
            for (int j = 0 ; j < i; j++){
                System.out.print("@");

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter input number:");
        symbol(scanner.nextInt());
        //scanner closer
        scanner.close();
    }
}
