
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        return new int[] {};
        // int[] aux = Arrays.copyOf(nums, nums.length);
        // Arrays.sort(nums);

        // int first = -1;
        // int second = -1;
        // int i = 0;
        // int j = nums.length - 1;

        // while (i < j) {
        //     int sum = nums[i] + nums[j];
        //     if (sum == target) {
        //         first = nums[i];
        //         second = nums[j];
        //         break;
        //     } else if (sum > target) {
        //         j--;
        //     } else {
        //         i++;
        //     }
        // }

        // int firstIndex = -1;
        // int secondIndex = -1;
        // for (int k = 0; k < aux.length; k++) {
        //     if (firstIndex == -1 && aux[k] == first) {
        //         firstIndex = k;
        //     } else if (secondIndex == -1 && aux[k] == second) {
        //         secondIndex = k;
        //     }
        // }

        // return new int[]{firstIndex, secondIndex};
}
}
