class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxXor = 0;
        int mask = 0;
        
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            
            Set<Integer> prefixes = new HashSet<>();
            for (int num : nums) {
                prefixes.add(num & mask);
            }
            
            int greedyTry = maxXor | (1 << i);
            for (int prefix : prefixes) {
                if (prefixes.contains(prefix ^ greedyTry)) {
                    maxXor = greedyTry;
                    break;
                }
            }
        }
        
        return maxXor;
    }
}
