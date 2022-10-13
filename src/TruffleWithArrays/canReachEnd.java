package TruffleWithArrays;

import java.util.Arrays;

public class canReachEnd {
    public static void main(String[] args) {
        int[] nums1 = { 3, 3, 1, 0, 2, 0, 1 };
        solution(nums1);
    }

    private static void solution(int[] nums1) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = i + nums1[i];
        }
        System.out.println(Arrays.toString(ans));
    }
    
}
