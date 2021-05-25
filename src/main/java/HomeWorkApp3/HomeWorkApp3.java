package HomeWorkApp3;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {

        swapOneZero();
        fillArray();
        lessThanSixArray();
        fillDiagonalOne();
        int i = initialValueLength(5, 10);
        System.out.println(i);
        minMaxValue();
    }

    public static void swapOneZero() {
        int[] a = {1, 0, 0, 1, 1, 1, 0, 0};
        for (int i = 0; i < 8; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
            System.out.println(a[i]);
        }
    }

    public static void fillArray() {
        int[] a = new int[100];
        a[0] = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.println(a[i]);
        }
    }

    public static void lessThanSixArray() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
            System.out.println(a[i]);
        }
    }

    public static void fillDiagonalOne() {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0, k = 4; j < a[i].length; j++, k--) {
                if (i == j || i == k) {
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int initialValueLength(int len, int initialValue) {
        int[] a = new int[len];
        Arrays.fill(a, initialValue);
        return a[0];
    }

    public static void minMaxValue() {
        int[] a = {10, 20, 30, 60};
        int max = Arrays.stream(a).max().getAsInt();
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("Max = " + max + "; Min = " + min);
    }


}
