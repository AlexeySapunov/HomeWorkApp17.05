package HomeWorkApp3;

import java.util.Arrays;

public class HomeWorkApp3a {

    public static void main(String[] args) {

        minMaxValue();

    }

    public static void minMaxValue() {
        int[] a = {10, 20, 30, 60};
        int max = Arrays.stream(a).max().getAsInt();
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("Max = " + max + "; Min = " + min);
    }
}
