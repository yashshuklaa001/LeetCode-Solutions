import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() < 3) {
            return set.first(); // largest
        }

        // remove two largest to get the third
        set.pollFirst();
        set.pollFirst();
        return set.first();
    }
}
