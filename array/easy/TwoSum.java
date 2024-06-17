package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum tsum = new TwoSum();
        int[] arr = {10, 4, 5, 6, 9, 2, 1};
        int targ = 11;

        // to show array in the right way just for checking:
        System.out.println(Arrays.toString(tsum.twoSum(arr, targ)));
    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> table = new HashMap<>(); // for storing variables and indexes;

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; // to get difference to further search for desired number;

            if (table.containsKey(diff)) {
                /* if this value (diff) is already in the table (in fact, equal some element from "nums"),
                so we got both of our variables and can return them indexes: */
                return new int[]{table.get(diff), i};
            }
            table.put(nums[i], i); // adding each pair element(key)-index(value) in the table;
        }
        // exception if we can't find desired pair:
        throw new IllegalArgumentException("No two sum solution");
    }
}
