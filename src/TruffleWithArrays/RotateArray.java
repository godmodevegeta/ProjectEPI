package TruffleWithArrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 5;
        System.out.println(Arrays.toString(solution(arr, k)));

    }
    private static int[] solution(int[] arr, int k) {
        int[] ans = new int[arr.length];
        k = k % arr.length;
        for (int i = 0; i < arr.length; i++) {
            int h = (i + k) % arr.length;
            ans[h] = arr[i];
        }
        return ans;
    }
}
