package ARRAY_Example;

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][2];

        System.out.println("Enter elements:");

        for(int i = 0; i < a.length; i++) {          // rows
            for(int j = 0; j < a[i].length; j++) {   // columns
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are:");

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}