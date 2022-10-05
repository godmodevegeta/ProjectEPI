package TruffleWithArrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IncrementOne {
    public static void main(String[] args) {
        int[] nums1 = { 6, 8, 2 };
        int[] nums2 = { 6, 8, 9 };
        int[] nums3 = { 6, 9, 9 };
        int[] nums4 = { 9, 9, 9 };
        int[] nums5 = { 6, 8, 2 };
        int[] nums6 = { 6, 8, 2 };
    
        solution(nums1);
        solution(nums2);
        solution(nums3);
        solution(nums4);
        solution(nums5);
        solution(nums6);
    }

    private static void solution(int[] nums) {
        int n = nums.length - 1;
        if (nums[nums.length - 1] < 9) {
            nums[n]++;
            System.out.println(Arrays.toString(nums));
            return;
        }
        else {
            for (int i = n; i >= 0; i--) {
                if (nums[i] == 9) {
                    nums[i] = 0;
                } else {
                    nums[i]++;
                    break;
                }
            }
            if (nums[0] != 0) {
                System.out.println(Arrays.toString(nums));
            }
            
        }
        if (nums[0] == 0) {
            List<Integer> list11 = Arrays.stream(nums).boxed().collect(Collectors.toList());
            list11.add(0, 1);
            System.out.println(list11);
        }
    }

}
