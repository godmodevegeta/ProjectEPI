package TruffleWithArrays;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 2, 2, 2, 1, 2, 1, 1, 0, 0, 1, 1, 1, 1, 2, 2 };
        solution(nums);
    }

    private static void solution(int[] nums) {
        int low = 0, high = nums.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else {
                mid++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int mid, int high) {
        int temp = nums[mid];
        nums[mid] = nums[high];
        nums[high] = temp;
    }
}
