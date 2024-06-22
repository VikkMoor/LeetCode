package medium;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum tsum = new ThreeSum();
        int[] arr = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        // to show array in the right way just for checking:
        System.out.println(tsum.threeSum(arr));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // to make it possible to solve with "two pointers";

        List<List<Integer>> list = new ArrayList<>(); // to store ready triplets;

        for (int i = 0; i < nums.length; i++) {
            int firstNum = nums[i];
            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;
            while (leftPointer < rightPointer) {
                int secondNum = nums[leftPointer];
                int thirdNum = nums[rightPointer];
                int currentSum = firstNum + secondNum + thirdNum;
                if (currentSum == 0) {
                    list.add((Arrays.asList(firstNum, secondNum, thirdNum)));
                    leftPointer++;
                    while (nums[leftPointer] == nums[leftPointer - 1] && leftPointer < rightPointer) {
                        leftPointer++;
                    }
                } else if (currentSum > 0) {
                    rightPointer--;
                } else {
                    leftPointer++;
                }
            }
            int j = i;
            while (j < nums.length - 2 && nums[j] == nums[j + 1]) {
                i++;
                j++;
            }
        }
        return list;
    }
}


