package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Logger;

class TwoSum {

    private static final Logger logger = Logger.getLogger(TwoSum.class.getName());

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        int[] test1 = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] test2 = ts.twoSum(new int[]{3, 2, 4}, 6);
        int[] test3 = ts.twoSum(new int[]{3, 3}, 6);

        logger.info(() -> "Test 1" + Arrays.toString(test1));
        logger.info(() -> "Test 2" + Arrays.toString(test2));
        logger.info(() -> "Test 3" + Arrays.toString(test3));
    }
}
