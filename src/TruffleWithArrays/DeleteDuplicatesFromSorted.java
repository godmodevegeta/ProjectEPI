package TruffleWithArrays;

import java.util.Arrays;
import java.util.TreeSet;

public class DeleteDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 4, 5, 5, 5, 7, 7, 7, 7, 8, 9, 9, 9 };
        // solution1(nums);    
        solution2(nums);
    }

    private static void solution2(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) nums[j] = 0;
            }
        }
    
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) nums[i++] = nums[j];
        }
        for (; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));    
    }

    private static void solution1(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : nums)
            set.add(i);
        int j = 0;
        while (!set.isEmpty()) {
            nums[j++] = set.pollFirst();
        }
        while (j != nums.length)
            nums[j++] = 0;
        System.out.println(Arrays.toString(nums));
    }

}
